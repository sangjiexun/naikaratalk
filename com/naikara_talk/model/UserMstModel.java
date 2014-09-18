package com.naikara_talk.model;

/**
 * <b>システム名称　　:</b>NAIKARA Talkシステム。<br>
 * <b>サブシステム名称:</b>マスタ保守。<br>
 * <b>クラス名称　　　:</b>利用者マスタメンテナンスModelクラス。<br>
 * <b>クラス概要　　　:</b>利用者マスタメンテナンスModel。<br>
 * <br>
 * <b>著作権　　　　　:</b>All rights recerved, Copyright(C), nai INDUSTRIES, LTD.
 * @author TECS
 * <b>変更履歴　　　　:</b>2013/07/04 TECS 新規作成。
 */
public class UserMstModel implements Model {

    private static final long serialVersionUID = 1L;

    /** 処理区分：新規 */
    public static final String PROS_KBN_ADD = "0";

    /** 処理区分：修正 */
    public static final String PROS_KBN_UPD = "1";

    /** 処理区分：照会 */
    public static final String PROS_KBN_REF = "2";

    /** 正常 */
    public static final int PROCESS_NORMAL = 0;

    /** 利用者ID */
    private String userId_lbl;

    /** パスワード */
    private String password_txt;

    /** 名前(姓) */
    private String nameFamiy_txt;

    /** 名前(名) */
    private String nameFirst_txt;

    /** フリガナ(姓) */
    private String furiganaFamiy_txt;

    /** フリガナ(名) */
    private String furiganaFirst_txt;

    /** ローマ字(姓) */
    private String romajiFamiy_txt;

    /** ローマ字(名) */
    private String romajiFirst_txt;

    /** 電話番号1 */
    private String telephone1_txt;

    /** 電話番号2 */
    private String telephone2_txt;

    /** 生年月日の年 */
    private String birthdayYy_txt;

    /** 生年月日の月 */
    private String birthdayMm_txt;

    /** 生年月日の日 */
    private String birthdayDd_txt;

    /** 郵便番号 */
    private String zipCode_txt;

    /** 住所(地域) */
    private String address1_sel;

    /** 住所(都道府県) */
    private String address2_sel;

    /** 住所(市区町村 等) */
    private String address3_txt;

    /** 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等) */
    private String address4_txt;

    /** 性別 */
    private String sex_rdl;

    /** メールアドレス1 */
    private String mailAdd1_txt;

    /** メールアドレス2 */
    private String mailAdd2_txt;

    /** メールアドレス3 */
    private String mailAdd3_txt;

    /** 利用期間開始日 */
    private String utilizationStart_txt;

    /** 利用期間終了日 */
    private String utilizationEnd_txt;

    /** 勤務拠点 */
    private String contract_txt;

    /** 種別 */
    private String userKbn_rdl;

    /** 備考 */
    private String remarks_txa;

    /** 処理区分(前画面情報) */
    private String processKbn_rdl;

    /** 画面表示処理区分 */
    private String processKbn_txt;

    /** レコードバージョン番号 */
    protected int recordVerNo;

    /** チェック用種別 */
    private String userKbn_chk;

    /**
     * チェック用種別取得<br>
     * <br>
     * チェック用種別取得を行う<br>
     * <br>
     * @param なし<br>
     * @return userKbn_chk チェック用種別<br>
     * @exception なし
     */
    public String getUserKbn_chk() {
        return userKbn_chk;
    }

    /**
     * チェック用種別設定<br>
     * <br>
     * チェック用種別設定を行う<br>
     * <br>
     * @param userKbn_chk チェック用種別<br>
     * @return なし<br>
     * @exception なし
     */
    public void setUserKbn_chk(String userKbn_chk) {
        this.userKbn_chk = userKbn_chk;
    }

    /**
     * 利用者ID取得<br>
     * <br>
     * 利用者ID取得を行う<br>
     * <br>
     * @param なし<br>
     * @return userId_lbl 利用者ID<br>
     * @exception なし
     */
    public String getUserId_lbl() {
        return userId_lbl;
    }

    /**
     * 利用者ID設定<br>
     * <br>
     * 利用者ID設定を行う<br>
     * <br>
     * @param userId_lbl 利用者ID<br>
     * @return なし<br>
     * @exception なし
     */
    public void setUserId_lbl(String userId_lbl) {
        this.userId_lbl = userId_lbl;
    }

    /**
     * パスワード取得<br>
     * <br>
     * パスワード取得を行う<br>
     * <br>
     * @param なし<br>
     * @return password_txt パスワード<br>
     * @exception なし
     */
    public String getPassword_txt() {
        return password_txt;
    }

    /**
     * パスワード設定<br>
     * <br>
     * パスワード設定を行う<br>
     * <br>
     * @param password_txt パスワード<br>
     * @return なし<br>
     * @exception なし
     */
    public void setPassword_txt(String password_txt) {
        this.password_txt = password_txt;
    }

    /**
     * 名前(姓)取得<br>
     * <br>
     * 名前(姓)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return nameFamiy_txt 名前(姓)<br>
     * @exception なし
     */
    public String getNameFamiy_txt() {
        return nameFamiy_txt;
    }

    /**
     * 名前(姓)設定<br>
     * <br>
     * 名前(姓)設定を行う<br>
     * <br>
     * @param nameFamiy_txt 名前(姓)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setNameFamiy_txt(String nameFamiy_txt) {
        this.nameFamiy_txt = nameFamiy_txt;
    }

    /**
     * 名前(名)取得<br>
     * <br>
     * 名前(名)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return nameFirst_txt 名前(名)<br>
     * @exception なし
     */
    public String getNameFirst_txt() {
        return nameFirst_txt;
    }

    /**
     * 名前(名)設定<br>
     * <br>
     * 名前(名)設定を行う<br>
     * <br>
     * @param nameFirst_txt 名前(名)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setNameFirst_txt(String nameFirst_txt) {
        this.nameFirst_txt = nameFirst_txt;
    }

    /**
     * フリガナ(姓)取得<br>
     * <br>
     * フリガナ(姓)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return furiganaFamiy_txt フリガナ(姓)<br>
     * @exception なし
     */
    public String getFuriganaFamiy_txt() {
        return furiganaFamiy_txt;
    }

    /**
     * フリガナ(姓)設定<br>
     * <br>
     * フリガナ(姓)設定を行う<br>
     * <br>
     * @param furiganaFamiy_txt フリガナ(姓)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setFuriganaFamiy_txt(String furiganaFamiy_txt) {
        this.furiganaFamiy_txt = furiganaFamiy_txt;
    }

    /**
     * フリガナ(名)取得<br>
     * <br>
     * フリガナ(名)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return furiganaFirst_txt フリガナ(名)<br>
     * @exception なし
     */
    public String getFuriganaFirst_txt() {
        return furiganaFirst_txt;
    }

    /**
     * フリガナ(名)設定<br>
     * <br>
     * フリガナ(名)設定を行う<br>
     * <br>
     * @param furiganaFirst_txt フリガナ(名)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setFuriganaFirst_txt(String furiganaFirst_txt) {
        this.furiganaFirst_txt = furiganaFirst_txt;
    }

    /**
     * ローマ字(姓)取得<br>
     * <br>
     * ローマ字(姓)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return romajiFamiy_txt ローマ字(姓)<br>
     * @exception なし
     */
    public String getRomajiFamiy_txt() {
        return romajiFamiy_txt;
    }

    /**
     * ローマ字(姓)設定<br>
     * <br>
     * ローマ字(姓)設定を行う<br>
     * <br>
     * @param romajiFamiy_txt ローマ字(姓)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setRomajiFamiy_txt(String romajiFamiy_txt) {
        this.romajiFamiy_txt = romajiFamiy_txt;
    }

    /**
     * ローマ字(名)取得<br>
     * <br>
     * ローマ字(名)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return romajiFirst_txt ローマ字(名)<br>
     * @exception なし
     */
    public String getRomajiFirst_txt() {
        return romajiFirst_txt;
    }

    /**
     * ローマ字(名)設定<br>
     * <br>
     * ローマ字(名)設定を行う<br>
     * <br>
     * @param romajiFirst_txt ローマ字(名)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setRomajiFirst_txt(String romajiFirst_txt) {
        this.romajiFirst_txt = romajiFirst_txt;
    }

    /**
     * 電話番号1取得<br>
     * <br>
     * 電話番号1取得を行う<br>
     * <br>
     * @param なし<br>
     * @return telephone1_txt 電話番号1<br>
     * @exception なし
     */
    public String getTelephone1_txt() {
        return telephone1_txt;
    }

    /**
     * 電話番号1設定<br>
     * <br>
     * 電話番号1設定を行う<br>
     * <br>
     * @param telephone1_txt 電話番号1<br>
     * @return なし<br>
     * @exception なし
     */
    public void setTelephone1_txt(String telephone1_txt) {
        this.telephone1_txt = telephone1_txt;
    }

    /**
     * 電話番号2取得<br>
     * <br>
     * 電話番号2取得を行う<br>
     * <br>
     * @param なし<br>
     * @return telephone2_txt 電話番号2<br>
     * @exception なし
     */
    public String getTelephone2_txt() {
        return telephone2_txt;
    }

    /**
     * 電話番号2設定<br>
     * <br>
     * 電話番号2設定を行う<br>
     * <br>
     * @param telephone2_txt 電話番号2<br>
     * @return なし<br>
     * @exception なし
     */
    public void setTelephone2_txt(String telephone2_txt) {
        this.telephone2_txt = telephone2_txt;
    }

    /**
     * 生年月日の年取得<br>
     * <br>
     * 生年月日の年取得を行う<br>
     * <br>
     * @param なし<br>
     * @return birthdayYy_txt 生年月日の年<br>
     * @exception なし
     */
    public String getBirthdayYy_txt() {
        return birthdayYy_txt;
    }

    /**
     * 生年月日の年設定<br>
     * <br>
     * 生年月日の年設定を行う<br>
     * <br>
     * @param birthdayYy_txt 生年月日の年<br>
     * @return なし<br>
     * @exception なし
     */
    public void setBirthdayYy_txt(String birthdayYy_txt) {
        this.birthdayYy_txt = birthdayYy_txt;
    }

    /**
     * 生年月日の月取得<br>
     * <br>
     * 生年月日の月取得を行う<br>
     * <br>
     * @param なし<br>
     * @return birthdayMm_txt 生年月日の月<br>
     * @exception なし
     */
    public String getBirthdayMm_txt() {
        return birthdayMm_txt;
    }

    /**
     * 生年月日の月設定<br>
     * <br>
     * 生年月日の月設定を行う<br>
     * <br>
     * @param birthdayMm_txt 生年月日の月<br>
     * @return なし<br>
     * @exception なし
     */
    public void setBirthdayMm_txt(String birthdayMm_txt) {
        this.birthdayMm_txt = birthdayMm_txt;
    }

    /**
     * 生年月日の日取得<br>
     * <br>
     * 生年月日の日取得を行う<br>
     * <br>
     * @param なし<br>
     * @return birthdayDd_txt 生年月日の日<br>
     * @exception なし
     */
    public String getBirthdayDd_txt() {
        return birthdayDd_txt;
    }

    /**
     * 生年月日の日設定<br>
     * <br>
     * 生年月日の日設定を行う<br>
     * <br>
     * @param birthdayDd_txt 生年月日の日<br>
     * @return なし<br>
     * @exception なし
     */
    public void setBirthdayDd_txt(String birthdayDd_txt) {
        this.birthdayDd_txt = birthdayDd_txt;
    }

    /**
     * 郵便番号取得<br>
     * <br>
     * 郵便番号取得を行う<br>
     * <br>
     * @param なし<br>
     * @return zipCode_txt 郵便番号<br>
     * @exception なし
     */
    public String getZipCode_txt() {
        return zipCode_txt;
    }

    /**
     * 郵便番号設定<br>
     * <br>
     * 郵便番号設定を行う<br>
     * <br>
     * @param zipCode_txt 郵便番号<br>
     * @return なし<br>
     * @exception なし
     */
    public void setZipCode_txt(String zipCode_txt) {
        this.zipCode_txt = zipCode_txt;
    }

    /**
     * 住所(地域)取得<br>
     * <br>
     * 住所(地域)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return address1_sel 住所(地域)<br>
     * @exception なし
     */
    public String getAddress1_sel() {
        return address1_sel;
    }

    /**
     * 住所(地域)設定<br>
     * <br>
     * 住所(地域)設定を行う<br>
     * <br>
     * @param address1_sel 住所(地域)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setAddress1_sel(String address1_sel) {
        this.address1_sel = address1_sel;
    }

    /**
     * 住所(都道府県)取得<br>
     * <br>
     * 住所(都道府県)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return address2_sel 住所(都道府県)<br>
     * @exception なし
     */
    public String getAddress2_sel() {
        return address2_sel;
    }

    /**
     * 住所(都道府県)設定<br>
     * <br>
     * 住所(都道府県)設定を行う<br>
     * <br>
     * @param address2_sel 住所(都道府県)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setAddress2_sel(String address2_sel) {
        this.address2_sel = address2_sel;
    }

    /**
     * 住所(市区町村 等)取得<br>
     * <br>
     * 住所(市区町村 等)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return address3_txt 住所(市区町村 等)<br>
     * @exception なし
     */
    public String getAddress3_txt() {
        return address3_txt;
    }

    /**
     * 住所(市区町村 等)設定<br>
     * <br>
     * 住所(市区町村 等)設定を行う<br>
     * <br>
     * @param address3_txt 住所(市区町村 等)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setAddress3_txt(String address3_txt) {
        this.address3_txt = address3_txt;
    }

    /**
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)取得<br>
     * <br>
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return address4_txt 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)<br>
     * @exception なし
     */
    public String getAddress4_txt() {
        return address4_txt;
    }

    /**
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)設定<br>
     * <br>
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)設定を行う<br>
     * <br>
     * @param address4_txt 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setAddress4_txt(String address4_txt) {
        this.address4_txt = address4_txt;
    }

    /**
     * 性別取得<br>
     * <br>
     * 性別取得を行う<br>
     * <br>
     * @param なし<br>
     * @return sex_rdl 性別<br>
     * @exception なし
     */
    public String getSex_rdl() {
        return sex_rdl;
    }

    /**
     * 性別設定<br>
     * <br>
     * 性別設定を行う<br>
     * <br>
     * @param sex_rdl 性別<br>
     * @return なし<br>
     * @exception なし
     */
    public void setSex_rdl(String sex_rdl) {
        this.sex_rdl = sex_rdl;
    }

    /**
     * メールアドレス1取得<br>
     * <br>
     * メールアドレス1取得を行う<br>
     * <br>
     * @param なし<br>
     * @return mailAdd1_txt メールアドレス1<br>
     * @exception なし
     */
    public String getMailAdd1_txt() {
        return mailAdd1_txt;
    }

    /**
     * メールアドレス1設定<br>
     * <br>
     * メールアドレス1設定を行う<br>
     * <br>
     * @param mailAdd1_txt メールアドレス1<br>
     * @return なし<br>
     * @exception なし
     */
    public void setMailAdd1_txt(String mailAdd1_txt) {
        this.mailAdd1_txt = mailAdd1_txt;
    }

    /**
     * メールアドレス2取得<br>
     * <br>
     * メールアドレス2取得を行う<br>
     * <br>
     * @param なし<br>
     * @return mailAdd2_txt メールアドレス2<br>
     * @exception なし
     */
    public String getMailAdd2_txt() {
        return mailAdd2_txt;
    }

    /**
     * メールアドレス2設定<br>
     * <br>
     * メールアドレス2設定を行う<br>
     * <br>
     * @param mailAdd2_txt メールアドレス2<br>
     * @return なし<br>
     * @exception なし
     */
    public void setMailAdd2_txt(String mailAdd2_txt) {
        this.mailAdd2_txt = mailAdd2_txt;
    }

    /**
     * メールアドレス3取得<br>
     * <br>
     * メールアドレス3取得を行う<br>
     * <br>
     * @param なし<br>
     * @return mailAdd3_txt メールアドレス3<br>
     * @exception なし
     */
    public String getMailAdd3_txt() {
        return mailAdd3_txt;
    }

    /**
     * メールアドレス3設定<br>
     * <br>
     * メールアドレス3設定を行う<br>
     * <br>
     * @param mailAdd3_txt メールアドレス3<br>
     * @return なし<br>
     * @exception なし
     */
    public void setMailAdd3_txt(String mailAdd3_txt) {
        this.mailAdd3_txt = mailAdd3_txt;
    }

    /**
     * 利用期間開始日取得<br>
     * <br>
     * 利用期間開始日取得を行う<br>
     * <br>
     * @param なし<br>
     * @return utilizationStart_txt 利用期間開始日<br>
     * @exception なし
     */
    public String getUtilizationStart_txt() {
        return utilizationStart_txt;
    }

    /**
     * 利用期間開始日設定<br>
     * <br>
     * 利用期間開始日設定を行う<br>
     * <br>
     * @param utilizationStart_txt 利用期間開始日<br>
     * @return なし<br>
     * @exception なし
     */
    public void setUtilizationStart_txt(String utilizationStart_txt) {
        this.utilizationStart_txt = utilizationStart_txt;
    }

    /**
     * 利用期間終了日取得<br>
     * <br>
     * 利用期間終了日取得を行う<br>
     * <br>
     * @param なし<br>
     * @return utilizationEnd_txt 利用期間終了日<br>
     * @exception なし
     */
    public String getUtilizationEnd_txt() {
        return utilizationEnd_txt;
    }

    /**
     * 利用期間終了日設定<br>
     * <br>
     * 利用期間終了日設定を行う<br>
     * <br>
     * @param utilizationEnd_txt 利用期間終了日<br>
     * @return なし<br>
     * @exception なし
     */
    public void setUtilizationEnd_txt(String utilizationEnd_txt) {
        this.utilizationEnd_txt = utilizationEnd_txt;
    }

    /**
     * 勤務拠点取得<br>
     * <br>
     * 勤務拠点取得を行う<br>
     * <br>
     * @param なし<br>
     * @return contract_txt 勤務拠点<br>
     * @exception なし
     */
    public String getContract_txt() {
        return contract_txt;
    }

    /**
     * 勤務拠点設定<br>
     * <br>
     * 勤務拠点設定を行う<br>
     * <br>
     * @param contract_txt 勤務拠点<br>
     * @return なし<br>
     * @exception なし
     */
    public void setContract_txt(String contract_txt) {
        this.contract_txt = contract_txt;
    }

    /**
     * 種別取得<br>
     * <br>
     * 種別取得を行う<br>
     * <br>
     * @param なし<br>
     * @return userKbn_rdl 種別<br>
     * @exception なし
     */
    public String getUserKbn_rdl() {
        return userKbn_rdl;
    }

    /**
     * 種別設定<br>
     * <br>
     * 種別設定を行う<br>
     * <br>
     * @param userKbn_rdl 種別<br>
     * @return なし<br>
     * @exception なし
     */
    public void setUserKbn_rdl(String userKbn_rdl) {
        this.userKbn_rdl = userKbn_rdl;
    }

    /**
     * 備考取得<br>
     * <br>
     * 備考取得を行う<br>
     * <br>
     * @param なし<br>
     * @return remarks_txa 備考<br>
     * @exception なし
     */
    public String getRemarks_txa() {
        return remarks_txa;
    }

    /**
     * 備考設定<br>
     * <br>
     * 備考設定を行う<br>
     * <br>
     * @param remarks_txa 備考<br>
     * @return なし<br>
     * @exception なし
     */
    public void setRemarks_txa(String remarks_txa) {
        this.remarks_txa = remarks_txa;
    }

    /**
     * 処理区分(前画面の引き継ぎ情報)取得<br>
     * <br>
     * 処理区分(前画面の引き継ぎ情報)取得を行う<br>
     * <br>
     * @param なし<br>
     * @return processKbn_rdl 処理区分(前画面の引き継ぎ情報)<br>
     * @exception なし
     */
    public String getProcessKbn_rdl() {
        return processKbn_rdl;
    }

    /**
     * 処理区分(前画面の引き継ぎ情報)設定<br>
     * <br>
     * 処理区分(前画面の引き継ぎ情報)設定を行う<br>
     * <br>
     * @param processKbn_rdl 処理区分(前画面の引き継ぎ情報)<br>
     * @return なし<br>
     * @exception なし
     */
    public void setProcessKbn_rdl(String processKbn_rdl) {
        this.processKbn_rdl = processKbn_rdl;
    }

    /**
     * 画面表示処理区分取得<br>
     * <br>
     * 画面表示処理区分取得を行う<br>
     * <br>
     * @param なし<br>
     * @return processKbn_txt 画面表示処理区分<br>
     * @exception なし
     */
    public String getProcessKbn_txt() {
        return processKbn_txt;
    }

    /**
     * 画面表示処理区分設定<br>
     * <br>
     * 画面表示処理区分設定を行う<br>
     * <br>
     * @param processKbn_txt 画面表示処理区分<br>
     * @return なし<br>
     * @exception なし
     */
    public void setProcessKbn_txt(String processKbn_txt) {
        this.processKbn_txt = processKbn_txt;
    }

    /**
     * 排他用レコードバージョン取得<br>
     * <br>
     * 排他用レコードバージョン取得を行う<br>
     * <br>
     * @param なし<br>
     * @return recordVerNo 排他用レコードバージョン<br>
     * @exception なし
     */
    public int getRecordVerNo() {
        return recordVerNo;
    }

    /**
     * 排他用レコードバージョン設定<br>
     * <br>
     * 排他用レコードバージョン設定を行う<br>
     * <br>
     * @param recordVerNo 排他用レコードバージョン<br>
     * @return なし<br>
     * @exception なし
     */
    public void setRecordVerNo(int recordVerNo) {
        this.recordVerNo = recordVerNo;
    }
}