package com.naikara_talk.logic;

import java.sql.Connection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import com.naikara_talk.dao.UserMstDao;
import com.naikara_talk.dbutil.ConditionMapper;
import com.naikara_talk.dbutil.OrderCondition;
import com.naikara_talk.dto.CodeManagMstDto;
import com.naikara_talk.dto.UserMstDto;
import com.naikara_talk.exception.NaiException;
import com.naikara_talk.mstcache.CodeManagMstCache;
import com.naikara_talk.util.NaikaraTalkConstants;

/**
 * <b>システム名称　　:</b>NAIKARA Talkシステム。<br>
 * <b>サブシステム名称:</b>マスタ保守。<br>
 * <b>クラス名称　　　:</b>利用者マスタメンテナンスLogicクラス。<br>
 * <b>クラス概要　　　:</b>利用者マスタメンテナンスLogic。<br>
 * <br>
 * <b>著作権　　　　　:</b>All rights recerved, Copyright(C), nai INDUSTRIES, LTD.
 * @author TECS
 * <b>変更履歴　　　　:</b>2013/07/04 TECS 新規作成。
 */
public class UserMstLogic {

    // コネクション変数
    public Connection conn = null;

    // コンストラクタ
    public UserMstLogic(Connection con) {
        this.conn = con;
    }

    /**
     * 初期表示<br>
     * <br>
     * 初期表示の検索処理<br>
     * <br>
     * @param dto 検索条件<br>
     * @return dtoResult 検索結果<br>
     * @exception NaiException
     */
    public UserMstDto select(UserMstDto dto) throws NaiException {

        // DAOの初期化
        UserMstDao dao = new UserMstDao(this.conn);

        // 並び順:利用者ID の昇順
        OrderCondition orderBy = new OrderCondition();
        orderBy.addCondition(UserMstDao.COND_USER_ID, OrderCondition.ASC);

        // 検索を行う
        List<UserMstDto> resultDto = dao.searchWithKnm(setConditions(dto), orderBy, new UserMstDto());

        // DTOの初期化
        UserMstDto dtoResult = new UserMstDto();

        // データありの場合
        if (resultDto.get(0).getReturnCode() != NaikaraTalkConstants.RETURN_CD_DATA_NO) {

            dtoResult = resultDto.get(0);
        }

        return dtoResult;
    }

    /**
     * 登録処理<br>
     * <br>
     * 登録処理を行う<br>
     * <br>
     * @param dto 登録データ<br>
     * @return int 登録結果<br>
     * @exception NaiException
     */
    public int insert(UserMstDto dto) throws NaiException {

        // DAOの初期化
        UserMstDao dao = new UserMstDao(this.conn);

        // 登録を行う
        return dao.insert(dto);
    }

    /**
     * 更新処理<br>
     * <br>
     * 更新処理を行う<br>
     * <br>
     * @param dto 更新データ<br>
     * @return int 更新結果<br>
     * @exception NaiException
     */
    public int update(UserMstDto dto) throws NaiException {

        // DAOの初期化
        UserMstDao dao = new UserMstDao(this.conn);

        // 更新を行う
        return dao.update(dto);
    }

    /**
     * データの存在チェック<br>
     * <br>
     * データの存在チェックを行う<br>
     * <br>
     * @param dto チェックデータ<br>
     * @return int チェック結果<br>
     * @exception NaiException
     */
    public int getExists(UserMstDto dto) throws NaiException {

        // DAOの初期化
        UserMstDao dao = new UserMstDao(this.conn);

        // 並び順:利用者ID の昇順
        OrderCondition orderBy = new OrderCondition();
        orderBy.addCondition(UserMstDao.COND_USER_ID, OrderCondition.ASC);

        // 検索を行う
        List<UserMstDto> resultDto = dao.searchWithKnm(setConditions(dto), orderBy, new UserMstDto());

        return resultDto.get(0).getReturnCode();
    }

    /**
     * コード取得<br>
     * <br>
     * コード管理マスタキャッシュからデータ取得処理<br>
     * <br>
     * @param category 汎用コード<br>
     * @return hashMap 取得結果<br>
     * @exception NaiException
     */
    public LinkedHashMap<String, String> selectCodeMst(String category) throws NaiException {

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<String, String>();

        CodeManagMstCache cache = CodeManagMstCache.getInstance();

        LinkedHashMap<String, CodeManagMstDto> list = cache.getList(category);

        Iterator<String> iter = list.keySet().iterator();

        while (iter.hasNext()) {

            Object key = iter.next();

            CodeManagMstDto dto = list.get(key);

            hashMap.put(dto.getManagerCd(), dto.getManagerNm());
        }

        return hashMap;
    }

    /**
     * 検索条件設定<br>
     * <br>
     * 検索条件を設定<br>
     * <br>
     * @param dto 検索条件<br>
     * @return conditions 設定後の検索条件<br>
     * @exception NaiException
     */
    private ConditionMapper setConditions(UserMstDto dto) throws NaiException {

        // 検索条件の初期化
        ConditionMapper conditions = new ConditionMapper();

        // 検索条件を設定
        conditions.addCondition(UserMstDao.COND_USER_ID, ConditionMapper.OPERATOR_EQUAL, dto.getUserId());

        // 戻り値
        return conditions;
    }
}