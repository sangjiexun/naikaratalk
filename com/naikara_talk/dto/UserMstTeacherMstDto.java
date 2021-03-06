package com.naikara_talk.dto;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.List;

/**
 * <b>システム名称　　:</b>NAIKARA Talkシステム<br>
 * <b>サブシステム名称:</b>共通部品 DTOクラス<br>
 * <b>クラス名称　　　:</b>利用者マスタ、講師マスタデータ取得クラス<br>
 * <b>クラス概要　　　:</b>利用者マスタ、講師マスタデータ取得DTO<br>
 * <br>
 * <b>著作権　　　　　:</b>Copyright (C) 2013 NAI, Inc. All rights reserved.
 * @author TECS
 * <b>変更履歴　　　　:</b>2013/06/27 TECS 新規作成
 * <b>　　　　　　　　:</b>2014/04/22 TECS 検索条件の追加(コース名)対応
 */
public class UserMstTeacherMstDto extends AbstractDto {

    // 利用者マスタ データ領域
    private String userId;                                // 利用者ID
    private String password;                              // パスワード
    private String familyJnm;                             // 名前(姓)
    private String firstJnm;                              // 名前(名)
    private String familyKnm;                             // フリガナ(姓)
    private String firstKnm;                              // フリガナ(名）
    private String familyRomaji;                          // ローマ字(姓)
    private String firstRomaji;                           // ローマ字(名)
    private String tel1;                                  // 電話番号1
    private String tel2;                                  // 電話番号2
    private String birthYyyy;                             // 生年月日：年
    private String birthMm;                               // 生年月日：月
    private String birthDd;                               // 生年月日：日
    private String zipCd;                                 // 郵便番号
    private String addressAreaCd;                         // 住所(地域)コード
    private String addressPrefectureCd;                   // 住所(都道府県)コード
    private String addressCity;                           // 住所(市区町村)
    private String addressOthers;                         // 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)
    private String genderKbn;                             // 性別区分
    private String mailAddress1;                          // メールアドレス1
    private String mailAddress2;                          // メールアドレス2
    private String mailAddress3;                          // メールアドレス3
    private String useStartDt;                            // 利用開始日
    private String useEndDt;                              // 利用終了日
    private String cityTown;                              // 勤務拠点
    private String classificationKbn;                     // 種別区分
    private String remarkU;                               // 備考
    private int recordVerNoU;                             // レコードバージョン番号
    private Timestamp insertDttmU;                        // 登録日時
    private String insertCdU;                             // 登録者コード
    private Timestamp updateDttmU;                        // 更新日時
    private String updateCdU;                             // 更新者コード

    // 講師マスタデータ領域
    private String userIdT;                               // 利用者ID
    private String nickAnm;                               // ニックネーム
    private String nationalityCd;                         // 国籍コード
    private String nativeLangCd;                          // 母国語コード
    private String countryCd;                             // 滞在国コード
    private String areaNoCd;                              // 時差地域NOコード
    private String contractDt;                            // 契約日
    private String contractStartDt;                       // 契約開始日
    private String contractEndDt;                         // 契約終了日
    private String bankJpnBankNm;                         // 国内銀行向け送金の場合：銀行名
    private String bankJpnBranchNm;                       // 国内銀行向け送金の場合：支店名
    private String bankJpnTypeOfAccount;                  // 国内銀行向け送金の場合：預金種別
    private String bankJpnAccountHoldersKnm;              // 国内銀行向け送金の場合：口座名義人（フリガナ）
    private String bankJpnAccountHoldersNm;               // 国内銀行向け送金の場合：口座名義人
    private String bankJpnAccountNumber;                  // 国内銀行向け送金の場合：口座番号
    private String bankJpnAdditionalInfo;                 // 国内銀行向け送金の場合：追加情報
    private String jpnPbankBranchNm;                      // 国内ゆうちょ銀行向け送金の場合:店番
    private String jpnPbankTypeOfAccount;                 // 国内ゆうちょ銀行向け送金の場合:預金種別
    private String jpnPbankAccountHoldersKnm;             // 国内ゆうちょ銀行向け送金の場合:口座名義人（フリガナ）
    private String jpnPbankAccountHoldersNm;              // 国内ゆうちょ銀行向け送金の場合:口座名義人
    private String jpnPbankAccountNumber;                 // 国内ゆうちょ銀行向け送金の場合:口座番号
    private String jpnPbankAdditionalInfo;                // 国内ゆうちょ銀行向け送金の場合:追加情報
    private String overseaAccountHNm;                     // 海外送金の場合:口座名義人
    private String overseaAccountHRAddress1;              // 海外送金の場合:口座名義人登録住所
    private String overseaAccountHRAddress2;              // 海外送金の場合:口座名義人登録住所（上記住所欄が一杯のとき）
    private String overseaAccountNumberIban;              // 海外送金の場合:口座番号/IBAN（ヨーロッパ）
    private String overseaAbanoSwiftcdBiccd;              // 海外送金の場合:ABAナンバー/SWIFTコード/BIC　Code　等
    private String overseaEtc;                            // 海外送金の場合:等
    private String overseaBankNm;                         // 海外送金の場合:銀行名
    private String overseaBranchNm;                       // 海外送金の場合:支店名
    private String overseaBranchAddress1;                 // 海外送金の場合:支店住所
    private String overseaBranchAddress2;                 // 海外送金の場合:支店住所（上記住所欄が一杯のとき）
    private String overseaCountryBranchExists;            // 海外送金の場合:支店が所在する国名
    private String overseaAdditionalInfo;                 // 海外送金の場合:追加情報
    private String otherRemittanceFeeKbn;                 // 外国送金関係銀行手数料区分
    private String overseaPlPaypalAddress;                // 海外ペイパル送金の場合:PayPalアドレス
    private String overseaPlAdditionalInfo;               // 海外ペイパル送金の場合:追加情報
    private String sellingPoint;                          // セールスポイント(スクール記入)
    private String selfRecommendation;                    // 受講生へのアピールポイント
    private String imgPhotoNm;                            // 講師画像名
    private Blob imgPhoto;                                // 講師画像
    private String evaluationFromSchoolCmt1;              // スクール側からのコメント(講師公開)
    private String evaluationFromSchoolCmt2;              // スクール側からのコメント(講師非公開)
    private String latestEvaluationFromStudentCmt;        // 最新の受講生から講師へのコメント
    private String remarkT;                               // 備考(講師は見えません)
    private int recordVerNoT;                             // レコードバージョン番号
    private Timestamp insertDttmT;                        // 登録日時
    private String insertCdT;                             // 登録者コード
    private Timestamp updateDttmT;                        // 更新日時
    private String updateCdT;                             // 更新者コード

    private int returnCode;                               // リターンコード

    // 画面処理必要項目
    private String userKnm;                               // 利用者名(フリガナ)(姓)と(名）
    private String genderKbnNm;                           // 性別区分名

    private String bookmark;                              // ブックマーク
    private List<TeacherCourseDto> teacherCourseDtoList;  // 講師別コースマスタ(+コースマスタ)DTO

    // 2014/04/22 Add Start 検索条件の追加(コース名)対応
    // コースマスタ
    private String bigClassificationCd;     // 大分類コード
    private String middleClassificationCd;  // 中分類コード
    private String smallClassificationCd;   // 小分類コード
    private String courseJnm;               // コース名
    // 2014/04/22 Add End   検索条件の追加(コース名)対応


    /**
     * 利用者ID取得<br>
     * <br>
     * 利用者IDを戻り値で返却する<br>
     * <br>
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 利用者ID設定<br>
     * <br>
     * 利用者IDを引数で設定する<br>
     * <br>
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * パスワード取得<br>
     * <br>
     * パスワードを戻り値で返却する<br>
     * <br>
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワード設定<br>
     * <br>
     * パスワードを引数で設定する<br>
     * <br>
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 名前(姓)取得<br>
     * <br>
     * 名前(姓)を戻り値で返却する<br>
     * <br>
     * @return familyJnm
     */
    public String getFamilyJnm() {
        return familyJnm;
    }

    /**
     * 名前(姓)設定<br>
     * <br>
     * 名前(姓)を引数で設定する<br>
     * <br>
     * @param familyJnm
     */
    public void setFamilyJnm(String familyJnm) {
        this.familyJnm = familyJnm;
    }

    /**
     * 名前(名)取得<br>
     * <br>
     * 名前(名)を戻り値で返却する<br>
     * <br>
     * @return firstJnm
     */
    public String getFirstJnm() {
        return firstJnm;
    }

    /**
     * 名前(名)設定<br>
     * <br>
     * 名前(名)を引数で設定する<br>
     * <br>
     * @param firstJnm
     */
    public void setFirstJnm(String firstJnm) {
        this.firstJnm = firstJnm;
    }

    /**
     * フリガナ(姓)取得<br>
     * <br>
     * フリガナ(姓)を戻り値で返却する<br>
     * <br>
     * @return familyKnm
     */
    public String getFamilyKnm() {
        return familyKnm;
    }

    /**
     * フリガナ(姓)設定<br>
     * <br>
     * フリガナ(姓)を引数で設定する<br>
     * <br>
     * @param familyKnm
     */
    public void setFamilyKnm(String familyKnm) {
        this.familyKnm = familyKnm;
    }

    /**
     * フリガナ(名）取得<br>
     * <br>
     * フリガナ(名）を戻り値で返却する<br>
     * <br>
     * @return firstKnm
     */
    public String getFirstKnm() {
        return firstKnm;
    }

    /**
     * フリガナ(名）設定<br>
     * <br>
     * フリガナ(名）を引数で設定する<br>
     * <br>
     * @param firstKnm
     */
    public void setFirstKnm(String firstKnm) {
        this.firstKnm = firstKnm;
    }

    /**
     * ローマ字(姓)取得<br>
     * <br>
     * ローマ字(姓)を戻り値で返却する<br>
     * <br>
     * @return familyRomaji
     */
    public String getFamilyRomaji() {
        return familyRomaji;
    }

    /**
     * ローマ字(姓)設定<br>
     * <br>
     * ローマ字(姓)を引数で設定する<br>
     * <br>
     * @param familyRomaji
     */
    public void setFamilyRomaji(String familyRomaji) {
        this.familyRomaji = familyRomaji;
    }

    /**
     * ローマ字(名)取得<br>
     * <br>
     * ローマ字(名)を戻り値で返却する<br>
     * <br>
     * @return firstRomaji
     */
    public String getFirstRomaji() {
        return firstRomaji;
    }

    /**
     * ローマ字(名)設定<br>
     * <br>
     * ローマ字(名)を引数で設定する<br>
     * <br>
     * @param firstRomaji
     */
    public void setFirstRomaji(String firstRomaji) {
        this.firstRomaji = firstRomaji;
    }

    /**
     * 電話番号1取得<br>
     * <br>
     * 電話番号1を戻り値で返却する<br>
     * <br>
     * @return tel1
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * 電話番号1設定<br>
     * <br>
     * 電話番号1を引数で設定する<br>
     * <br>
     * @param tel1
     */
    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    /**
     * 電話番号2取得<br>
     * <br>
     * 電話番号2を戻り値で返却する<br>
     * <br>
     * @return tel2
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * 電話番号2設定<br>
     * <br>
     * 電話番号2を引数で設定する<br>
     * <br>
     * @param tel2
     */
    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    /**
     * 生年月日：年取得<br>
     * <br>
     * 生年月日：年を戻り値で返却する<br>
     * <br>
     * @return birthYyyy
     */
    public String getBirthYyyy() {
        return birthYyyy;
    }

    /**
     * 生年月日：年設定<br>
     * <br>
     * 生年月日：年を引数で設定する<br>
     * <br>
     * @param birthYyyy
     */
    public void setBirthYyyy(String birthYyyy) {
        this.birthYyyy = birthYyyy;
    }

    /**
     * 生年月日：月取得<br>
     * <br>
     * 生年月日：月を戻り値で返却する<br>
     * <br>
     * @return birthMm
     */
    public String getBirthMm() {
        return birthMm;
    }

    /**
     * 生年月日：月設定<br>
     * <br>
     * 生年月日：月を引数で設定する<br>
     * <br>
     * @param birthMm
     */
    public void setBirthMm(String birthMm) {
        this.birthMm = birthMm;
    }

    /**
     * 生年月日：日取得<br>
     * <br>
     * 生年月日：日を戻り値で返却する<br>
     * <br>
     * @return birthDd
     */
    public String getBirthDd() {
        return birthDd;
    }

    /**
     * 生年月日：日設定<br>
     * <br>
     * 生年月日：日を引数で設定する<br>
     * <br>
     * @param birthDd
     */
    public void setBirthDd(String birthDd) {
        this.birthDd = birthDd;
    }

    /**
     * 郵便番号取得<br>
     * <br>
     * 郵便番号を戻り値で返却する<br>
     * <br>
     * @return zipCd
     */
    public String getZipCd() {
        return zipCd;
    }

    /**
     * 郵便番号設定<br>
     * <br>
     * 郵便番号を引数で設定する<br>
     * <br>
     * @param zipCd
     */
    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    /**
     * 住所(地域)コード取得<br>
     * <br>
     * 住所(地域)コードを戻り値で返却する<br>
     * <br>
     * @return addressAreaCd
     */
    public String getAddressAreaCd() {
        return addressAreaCd;
    }

    /**
     * 住所(地域)コード設定<br>
     * <br>
     * 住所(地域)コードを引数で設定する<br>
     * <br>
     * @param addressAreaCd
     */
    public void setAddressAreaCd(String addressAreaCd) {
        this.addressAreaCd = addressAreaCd;
    }

    /**
     * 住所(都道府県)コード取得<br>
     * <br>
     * 住所(都道府県)コードを戻り値で返却する<br>
     * <br>
     * @return addressPrefectureCd
     */
    public String getAddressPrefectureCd() {
        return addressPrefectureCd;
    }

    /**
     * 住所(都道府県)コード設定<br>
     * <br>
     * 住所(都道府県)コードを引数で設定する<br>
     * <br>
     * @param addressPrefectureCd
     */
    public void setAddressPrefectureCd(String addressPrefectureCd) {
        this.addressPrefectureCd = addressPrefectureCd;
    }

    /**
     * 住所(市区町村)取得<br>
     * <br>
     * 住所(市区町村)を戻り値で返却する<br>
     * <br>
     * @return addressCity
     */
    public String getAddressCity() {
        return addressCity;
    }

    /**
     * 住所(市区町村)設定<br>
     * <br>
     * 住所(市区町村)を引数で設定する<br>
     * <br>
     * @param addressCity
     */
    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    /**
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)取得<br>
     * <br>
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)を戻り値で返却する<br>
     * <br>
     * @return addressOthers
     */
    public String getAddressOthers() {
        return addressOthers;
    }

    /**
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)設定<br>
     * <br>
     * 住所(ﾋﾞﾙ、ﾏﾝｼｮﾝ名 等)を引数で設定する<br>
     * <br>
     * @param addressOthers
     */
    public void setAddressOthers(String addressOthers) {
        this.addressOthers = addressOthers;
    }

    /**
     * 性別区分取得<br>
     * <br>
     * 性別区分を戻り値で返却する<br>
     * <br>
     * @return genderKbn
     */
    public String getGenderKbn() {
        return genderKbn;
    }

    /**
     * 性別区分設定<br>
     * <br>
     * 性別区分を引数で設定する<br>
     * <br>
     * @param genderKbn
     */
    public void setGenderKbn(String genderKbn) {
        this.genderKbn = genderKbn;
    }

    /**
     * メールアドレス1取得<br>
     * <br>
     * メールアドレス1を戻り値で返却する<br>
     * <br>
     * @return mailAddress1
     */
    public String getMailAddress1() {
        return mailAddress1;
    }

    /**
     * メールアドレス1設定<br>
     * <br>
     * メールアドレス1を引数で設定する<br>
     * <br>
     * @param mailAddress1
     */
    public void setMailAddress1(String mailAddress1) {
        this.mailAddress1 = mailAddress1;
    }

    /**
     * メールアドレス2取得<br>
     * <br>
     * メールアドレス2を戻り値で返却する<br>
     * <br>
     * @return mailAddress2
     */
    public String getMailAddress2() {
        return mailAddress2;
    }

    /**
     * メールアドレス2設定<br>
     * <br>
     * メールアドレス2を引数で設定する<br>
     * <br>
     * @param mailAddress2
     */
    public void setMailAddress2(String mailAddress2) {
        this.mailAddress2 = mailAddress2;
    }

    /**
     * メールアドレス3取得<br>
     * <br>
     * メールアドレス3を戻り値で返却する<br>
     * <br>
     * @return mailAddress3
     */
    public String getMailAddress3() {
        return mailAddress3;
    }

    /**
     * メールアドレス3設定<br>
     * <br>
     * メールアドレス3を引数で設定する<br>
     * <br>
     * @param mailAddress3
     */
    public void setMailAddress3(String mailAddress3) {
        this.mailAddress3 = mailAddress3;
    }

    /**
     * 利用開始日取得<br>
     * <br>
     * 利用開始日を戻り値で返却する<br>
     * <br>
     * @return useStartDt
     */
    public String getUseStartDt() {
        return useStartDt;
    }

    /**
     * 利用開始日設定<br>
     * <br>
     * 利用開始日を引数で設定する<br>
     * <br>
     * @param useStartDt
     */
    public void setUseStartDt(String useStartDt) {
        this.useStartDt = useStartDt;
    }

    /**
     * 利用終了日取得<br>
     * <br>
     * 利用終了日を戻り値で返却する<br>
     * <br>
     * @return useEndDt
     */
    public String getUseEndDt() {
        return useEndDt;
    }

    /**
     * 利用終了日設定<br>
     * <br>
     * 利用終了日を引数で設定する<br>
     * <br>
     * @param useEndDt
     */
    public void setUseEndDt(String useEndDt) {
        this.useEndDt = useEndDt;
    }

    /**
     * 勤務拠点取得<br>
     * <br>
     * 勤務拠点を戻り値で返却する<br>
     * <br>
     * @return cityTown
     */
    public String getCityTown() {
        return cityTown;
    }

    /**
     * 勤務拠点設定<br>
     * <br>
     * 勤務拠点を引数で設定する<br>
     * <br>
     * @param cityTown
     */
    public void setCityTown(String cityTown) {
        this.cityTown = cityTown;
    }

    /**
     * 種別区分取得<br>
     * <br>
     * 種別区分を戻り値で返却する<br>
     * <br>
     * @return classificationKbn
     */
    public String getClassificationKbn() {
        return classificationKbn;
    }

    /**
     * 種別区分設定<br>
     * <br>
     * 種別区分を引数で設定する<br>
     * <br>
     * @param classificationKbn
     */
    public void setClassificationKbn(String classificationKbn) {
        this.classificationKbn = classificationKbn;
    }

    /**
     * 備考取得<br>
     * <br>
     * 備考を戻り値で返却する<br>
     * <br>
     * @return remark
     */
    public String getRemarkU() {
        return remarkU;
    }

    /**
     * 備考設定<br>
     * <br>
     * 備考を引数で設定する<br>
     * <br>
     * @param remark
     */
    public void setRemarkU(String remark) {
        this.remarkU = remark;
    }

    /**
     * レコードバージョン番号取得<br>
     * <br>
     * レコードバージョン番号を戻り値で返却する<br>
     * <br>
     * @return recordVerNo
     */
    public int getRecordVerNoU() {
        return recordVerNoU;
    }

    /**
     * レコードバージョン番号設定<br>
     * <br>
     * レコードバージョン番号を引数で設定する<br>
     * <br>
     * @param recordVerNo
     */
    public void setRecordVerNoU(int recordVerNo) {
        this.recordVerNoU = recordVerNo;
    }

    /**
     * 登録日時取得<br>
     * <br>
     * 登録日時を戻り値で返却する<br>
     * <br>
     * @return insertDttm
     */
    public Timestamp getInsertDttmU() {
        return insertDttmU;
    }

    /**
     * 登録日時設定<br>
     * <br>
     * 登録日時を引数で設定する<br>
     * <br>
     * @param insertDttm
     */
    public void setInsertDttmU(Timestamp insertDttm) {
        this.insertDttmU = insertDttm;
    }

    /**
     * 登録者コード取得<br>
     * <br>
     * 登録者コードを戻り値で返却する<br>
     * <br>
     * @return insertCd
     */
    public String getInsertCdU() {
        return insertCdU;
    }

    /**
     * 登録者コード設定<br>
     * <br>
     * 登録者コードを引数で設定する<br>
     * <br>
     * @param insertCd
     */
    public void setInsertCdU(String insertCd) {
        this.insertCdU = insertCd;
    }

    /**
     * 更新日時取得<br>
     * <br>
     * 更新日時を戻り値で返却する<br>
     * <br>
     * @return updateDttm
     */
    public Timestamp getUpdateDttmU() {
        return updateDttmU;
    }

    /**
     * 更新日時設定<br>
     * <br>
     * 更新日時を引数で設定する<br>
     * <br>
     * @param updateDttm
     */
    public void setUpdateDttmU(Timestamp updateDttm) {
        this.updateDttmU = updateDttm;
    }

    /**
     * 更新者コード取得<br>
     * <br>
     * 更新者コードを戻り値で返却する<br>
     * <br>
     * @return updateCd
     */
    public String getUpdateCdU() {
        return updateCdU;
    }

    /**
     * 更新者コード設定<br>
     * <br>
     * 更新者コードを引数で設定する<br>
     * <br>
     * @param updateCd
     */
    public void setUpdateCdU(String updateCd) {
        this.updateCdU = updateCd;
    }

    /**
     * 利用者ID取得<br>
     * <br>
     * 利用者IDを戻り値で返却する<br>
     * <br>
     * @return userIdT
     */
    public String getUserIdT() {
        return userIdT;
    }

    /**
     * 利用者ID設定<br>
     * <br>
     * 利用者IDを引数で設定する<br>
     * <br>
     * @param userIdT
     */
    public void setUserIdT(String userIdT) {
        this.userIdT = userIdT;
    }

    /**
     * ニックネーム取得<br>
     * <br>
     * ニックネームを戻り値で返却する<br>
     * <br>
     * @return nickAnm
     */
    public String getNickAnm() {
        return nickAnm;
    }

    /**
     * ニックネーム設定<br>
     * <br>
     * ニックネームを引数で設定する<br>
     * <br>
     * @param nickAnm
     */
    public void setNickAnm(String nickAnm) {
        this.nickAnm = nickAnm;
    }

    /**
     * 国籍コード取得<br>
     * <br>
     * 国籍コードを戻り値で返却する<br>
     * <br>
     * @return nationalityCd
     */
    public String getNationalityCd() {
        return nationalityCd;
    }

    /**
     * 国籍コード設定<br>
     * <br>
     * 国籍コードを引数で設定する<br>
     * <br>
     * @param nationalityCd
     */
    public void setNationalityCd(String nationalityCd) {
        this.nationalityCd = nationalityCd;
    }

    /**
     * 母国語コード取得<br>
     * <br>
     * 母国語コードを戻り値で返却する<br>
     * <br>
     * @return nativeLangCd
     */
    public String getNativeLangCd() {
        return nativeLangCd;
    }

    /**
     * 母国語コード設定<br>
     * <br>
     * 母国語コードを引数で設定する<br>
     * <br>
     * @param nativeLangCd
     */
    public void setNativeLangCd(String nativeLangCd) {
        this.nativeLangCd = nativeLangCd;
    }

    /**
     * 滞在国コード取得<br>
     * <br>
     * 滞在国コードを戻り値で返却する<br>
     * <br>
     * @return countryCd
     */
    public String getCountryCd() {
        return countryCd;
    }

    /**
     * 滞在国コード設定<br>
     * <br>
     * 滞在国コードを引数で設定する<br>
     * <br>
     * @param countryCd
     */
    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    /**
     * 時差地域NOコード取得<br>
     * <br>
     * 時差地域NOコードを戻り値で返却する<br>
     * <br>
     * @return areaNoCd
     */
    public String getAreaNoCd() {
        return areaNoCd;
    }

    /**
     * 時差地域NOコード設定<br>
     * <br>
     * 時差地域NOコードを引数で設定する<br>
     * <br>
     * @param areaNoCd
     */
    public void setAreaNoCd(String areaNoCd) {
        this.areaNoCd = areaNoCd;
    }

    /**
     * 契約日取得<br>
     * <br>
     * 契約日を戻り値で返却する<br>
     * <br>
     * @return contractDt
     */
    public String getContractDt() {
        return contractDt;
    }

    /**
     * 契約日設定<br>
     * <br>
     * 契約日を引数で設定する<br>
     * <br>
     * @param contractDt
     */
    public void setContractDt(String contractDt) {
        this.contractDt = contractDt;
    }

    /**
     * 契約開始日取得<br>
     * <br>
     * 契約開始日を戻り値で返却する<br>
     * <br>
     * @return contractStartDt
     */
    public String getContractStartDt() {
        return contractStartDt;
    }

    /**
     * 契約開始日設定<br>
     * <br>
     * 契約開始日を引数で設定する<br>
     * <br>
     * @param contractStartDt
     */
    public void setContractStartDt(String contractStartDt) {
        this.contractStartDt = contractStartDt;
    }

    /**
     * 契約終了日取得<br>
     * <br>
     * 契約終了日を戻り値で返却する<br>
     * <br>
     * @return contractEndDt
     */
    public String getContractEndDt() {
        return contractEndDt;
    }

    /**
     * 契約終了日設定<br>
     * <br>
     * 契約終了日を引数で設定する<br>
     * <br>
     * @param contractEndDt
     */
    public void setContractEndDt(String contractEndDt) {
        this.contractEndDt = contractEndDt;
    }

    /**
     * 国内銀行向け送金の場合：銀行名取得<br>
     * <br>
     * 国内銀行向け送金の場合：銀行名を戻り値で返却する<br>
     * <br>
     * @return bankJpnBankNm
     */
    public String getBankJpnBankNm() {
        return bankJpnBankNm;
    }

    /**
     * 国内銀行向け送金の場合：銀行名設定<br>
     * <br>
     * 国内銀行向け送金の場合：銀行名を引数で設定する<br>
     * <br>
     * @param bankJpnBankNm
     */
    public void setBankJpnBankNm(String bankJpnBankNm) {
        this.bankJpnBankNm = bankJpnBankNm;
    }

    /**
     * 国内銀行向け送金の場合：支店名取得<br>
     * <br>
     * 国内銀行向け送金の場合：支店名を戻り値で返却する<br>
     * <br>
     * @return bankJpnBranchNm
     */
    public String getBankJpnBranchNm() {
        return bankJpnBranchNm;
    }

    /**
     * 国内銀行向け送金の場合：支店名設定<br>
     * <br>
     * 国内銀行向け送金の場合：支店名を引数で設定する<br>
     * <br>
     * @param bankJpnBranchNm
     */
    public void setBankJpnBranchNm(String bankJpnBranchNm) {
        this.bankJpnBranchNm = bankJpnBranchNm;
    }

    /**
     * 国内銀行向け送金の場合：預金種別取得<br>
     * <br>
     * 国内銀行向け送金の場合：預金種別を戻り値で返却する<br>
     * <br>
     * @return bankJpnTypeOfAccount
     */
    public String getBankJpnTypeOfAccount() {
        return bankJpnTypeOfAccount;
    }

    /**
     * 国内銀行向け送金の場合：預金種別設定<br>
     * <br>
     * 国内銀行向け送金の場合：預金種別を引数で設定する<br>
     * <br>
     * @param bankJpnTypeOfAccount
     */
    public void setBankJpnTypeOfAccount(String bankJpnTypeOfAccount) {
        this.bankJpnTypeOfAccount = bankJpnTypeOfAccount;
    }

    /**
     * 国内銀行向け送金の場合：口座名義人（フリガナ）取得<br>
     * <br>
     * 国内銀行向け送金の場合：口座名義人（フリガナ）を戻り値で返却する<br>
     * <br>
     * @return bankJpnAccountHoldersKnm
     */
    public String getBankJpnAccountHoldersKnm() {
        return bankJpnAccountHoldersKnm;
    }

    /**
     * 国内銀行向け送金の場合：口座名義人（フリガナ）設定<br>
     * <br>
     * 国内銀行向け送金の場合：口座名義人（フリガナ）を引数で設定する<br>
     * <br>
     * @param bankJpnAccountHoldersKnm
     */
    public void setBankJpnAccountHoldersKnm(String bankJpnAccountHoldersKnm) {
        this.bankJpnAccountHoldersKnm = bankJpnAccountHoldersKnm;
    }

    /**
     * 国内銀行向け送金の場合：口座名義人取得<br>
     * <br>
     * 国内銀行向け送金の場合：口座名義人を戻り値で返却する<br>
     * <br>
     * @return bankJpnAccountHoldersNm
     */
    public String getBankJpnAccountHoldersNm() {
        return bankJpnAccountHoldersNm;
    }

    /**
     * 国内銀行向け送金の場合：口座名義人設定<br>
     * <br>
     * 国内銀行向け送金の場合：口座名義人を引数で設定する<br>
     * <br>
     * @param bankJpnAccountHoldersNm
     */
    public void setBankJpnAccountHoldersNm(String bankJpnAccountHoldersNm) {
        this.bankJpnAccountHoldersNm = bankJpnAccountHoldersNm;
    }

    /**
     * 国内銀行向け送金の場合：口座番号取得<br>
     * <br>
     * 国内銀行向け送金の場合：口座番号を戻り値で返却する<br>
     * <br>
     * @return bankJpnAccountNumber
     */
    public String getBankJpnAccountNumber() {
        return bankJpnAccountNumber;
    }

    /**
     * 国内銀行向け送金の場合：口座番号設定<br>
     * <br>
     * 国内銀行向け送金の場合：口座番号を引数で設定する<br>
     * <br>
     * @param bankJpnAccountNumber
     */
    public void setBankJpnAccountNumber(String bankJpnAccountNumber) {
        this.bankJpnAccountNumber = bankJpnAccountNumber;
    }

    /**
     * 国内銀行向け送金の場合：追加情報取得<br>
     * <br>
     * 国内銀行向け送金の場合：追加情報を戻り値で返却する<br>
     * <br>
     * @return bankJpnAdditionalInfo
     */
    public String getBankJpnAdditionalInfo() {
        return bankJpnAdditionalInfo;
    }

    /**
     * 国内銀行向け送金の場合：追加情報設定<br>
     * <br>
     * 国内銀行向け送金の場合：追加情報を引数で設定する<br>
     * <br>
     * @param bankJpnAdditionalInfo
     */
    public void setBankJpnAdditionalInfo(String bankJpnAdditionalInfo) {
        this.bankJpnAdditionalInfo = bankJpnAdditionalInfo;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:店番取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:店番を戻り値で返却する<br>
     * <br>
     * @return jpnPbankBranchNm
     */
    public String getJpnPbankBranchNm() {
        return jpnPbankBranchNm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:店番設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:店番を引数で設定する<br>
     * <br>
     * @param jpnPbankBranchNm
     */
    public void setJpnPbankBranchNm(String jpnPbankBranchNm) {
        this.jpnPbankBranchNm = jpnPbankBranchNm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:預金種別取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:預金種別を戻り値で返却する<br>
     * <br>
     * @return jpnPbankTypeOfAccount
     */
    public String getJpnPbankTypeOfAccount() {
        return jpnPbankTypeOfAccount;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:預金種別設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:預金種別を引数で設定する<br>
     * <br>
     * @param jpnPbankTypeOfAccount
     */
    public void setJpnPbankTypeOfAccount(String jpnPbankTypeOfAccount) {
        this.jpnPbankTypeOfAccount = jpnPbankTypeOfAccount;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座名義人（フリガナ）取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座名義人（フリガナ）を戻り値で返却する<br>
     * <br>
     * @return jpnPbankAccountHoldersKnm
     */
    public String getJpnPbankAccountHoldersKnm() {
        return jpnPbankAccountHoldersKnm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座名義人（フリガナ）設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座名義人（フリガナ）を引数で設定する<br>
     * <br>
     * @param jpnPbankAccountHoldersKnm
     */
    public void setJpnPbankAccountHoldersKnm(String jpnPbankAccountHoldersKnm) {
        this.jpnPbankAccountHoldersKnm = jpnPbankAccountHoldersKnm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座名義人取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座名義人を戻り値で返却する<br>
     * <br>
     * @return jpnPbankAccountHoldersNm
     */
    public String getJpnPbankAccountHoldersNm() {
        return jpnPbankAccountHoldersNm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座名義人設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座名義人を引数で設定する<br>
     * <br>
     * @param jpnPbankAccountHoldersNm
     */
    public void setJpnPbankAccountHoldersNm(String jpnPbankAccountHoldersNm) {
        this.jpnPbankAccountHoldersNm = jpnPbankAccountHoldersNm;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座番号取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座番号を戻り値で返却する<br>
     * <br>
     * @return jpnPbankAccountNumber
     */
    public String getJpnPbankAccountNumber() {
        return jpnPbankAccountNumber;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:口座番号設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:口座番号を引数で設定する<br>
     * <br>
     * @param jpnPbankAccountNumber
     */
    public void setJpnPbankAccountNumber(String jpnPbankAccountNumber) {
        this.jpnPbankAccountNumber = jpnPbankAccountNumber;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:追加情報取得<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:追加情報を戻り値で返却する<br>
     * <br>
     * @return jpnPbankAdditionalInfo
     */
    public String getJpnPbankAdditionalInfo() {
        return jpnPbankAdditionalInfo;
    }

    /**
     * 国内ゆうちょ銀行向け送金の場合:追加情報設定<br>
     * <br>
     * 国内ゆうちょ銀行向け送金の場合:追加情報を引数で設定する<br>
     * <br>
     * @param jpnPbankAdditionalInfo
     */
    public void setJpnPbankAdditionalInfo(String jpnPbankAdditionalInfo) {
        this.jpnPbankAdditionalInfo = jpnPbankAdditionalInfo;
    }

    /**
     * 海外送金の場合:口座名義人取得<br>
     * <br>
     * 海外送金の場合:口座名義人を戻り値で返却する<br>
     * <br>
     * @return overseaAccountHNm
     */
    public String getOverseaAccountHNm() {
        return overseaAccountHNm;
    }

    /**
     * 海外送金の場合:口座名義人設定<br>
     * <br>
     * 海外送金の場合:口座名義人を引数で設定する<br>
     * <br>
     * @param overseaAccountHNm
     */
    public void setOverseaAccountHNm(String overseaAccountHNm) {
        this.overseaAccountHNm = overseaAccountHNm;
    }

    /**
     * 海外送金の場合:口座名義人登録住所取得<br>
     * <br>
     * 海外送金の場合:口座名義人登録住所を戻り値で返却する<br>
     * <br>
     * @return overseaAccountHRAddress1
     */
    public String getOverseaAccountHRAddress1() {
        return overseaAccountHRAddress1;
    }

    /**
     * 海外送金の場合:口座名義人登録住所設定<br>
     * <br>
     * 海外送金の場合:口座名義人登録住所を引数で設定する<br>
     * <br>
     * @param overseaAccountHRAddress1
     */
    public void setOverseaAccountHRAddress1(String overseaAccountHRAddress1) {
        this.overseaAccountHRAddress1 = overseaAccountHRAddress1;
    }

    /**
     * 海外送金の場合:口座名義人登録住所（上記住所欄が一杯のとき）取得<br>
     * <br>
     * 海外送金の場合:口座名義人登録住所（上記住所欄が一杯のとき）を戻り値で返却する<br>
     * <br>
     * @return overseaAccountHRAddress2
     */
    public String getOverseaAccountHRAddress2() {
        return overseaAccountHRAddress2;
    }

    /**
     * 海外送金の場合:口座名義人登録住所（上記住所欄が一杯のとき）設定<br>
     * <br>
     * 海外送金の場合:口座名義人登録住所（上記住所欄が一杯のとき）を引数で設定する<br>
     * <br>
     * @param overseaAccountHRAddress2
     */
    public void setOverseaAccountHRAddress2(String overseaAccountHRAddress2) {
        this.overseaAccountHRAddress2 = overseaAccountHRAddress2;
    }

    /**
     * 海外送金の場合:口座番号/IBAN（ヨーロッパ）取得<br>
     * <br>
     * 海外送金の場合:口座番号/IBAN（ヨーロッパ）を戻り値で返却する<br>
     * <br>
     * @return overseaAccountNumberIban
     */
    public String getOverseaAccountNumberIban() {
        return overseaAccountNumberIban;
    }

    /**
     * 海外送金の場合:口座番号/IBAN（ヨーロッパ）設定<br>
     * <br>
     * 海外送金の場合:口座番号/IBAN（ヨーロッパ）を引数で設定する<br>
     * <br>
     * @param overseaAccountNumberIban
     */
    public void setOverseaAccountNumberIban(String overseaAccountNumberIban) {
        this.overseaAccountNumberIban = overseaAccountNumberIban;
    }

    /**
     * 海外送金の場合:ABAナンバー/SWIFTコード/BIC Code　等取得<br>
     * <br>
     * 海外送金の場合:ABAナンバー/SWIFTコード/BIC Code　等を戻り値で返却する<br>
     * <br>
     * @return overseaAbanoSwiftcdBiccd
     */
    public String getOverseaAbanoSwiftcdBiccd() {
        return overseaAbanoSwiftcdBiccd;
    }

    /**
     * 海外送金の場合:ABAナンバー/SWIFTコード/BIC Code　等設定<br>
     * <br>
     * 海外送金の場合:ABAナンバー/SWIFTコード/BIC Code　等を引数で設定する<br>
     * <br>
     * @param overseaAbanoSwiftcdBiccd
     */
    public void setOverseaAbanoSwiftcdBiccd(String overseaAbanoSwiftcdBiccd) {
        this.overseaAbanoSwiftcdBiccd = overseaAbanoSwiftcdBiccd;
    }

    /**
     * 海外送金の場合:等取得<br>
     * <br>
     * 海外送金の場合:等を戻り値で返却する<br>
     * <br>
     * @return overseaEtc
     */
    public String getOverseaEtc() {
        return overseaEtc;
    }

    /**
     * 海外送金の場合:等設定<br>
     * <br>
     * 海外送金の場合:等を引数で設定する<br>
     * <br>
     * @param overseaEtc
     */
    public void setOverseaEtc(String overseaEtc) {
        this.overseaEtc = overseaEtc;
    }

    /**
     * 海外送金の場合:銀行名取得<br>
     * <br>
     * 海外送金の場合:銀行名を戻り値で返却する<br>
     * <br>
     * @return overseaBankNm
     */
    public String getOverseaBankNm() {
        return overseaBankNm;
    }

    /**
     * 海外送金の場合:銀行名設定<br>
     * <br>
     * 海外送金の場合:銀行名を引数で設定する<br>
     * <br>
     * @param overseaBankNm
     */
    public void setOverseaBankNm(String overseaBankNm) {
        this.overseaBankNm = overseaBankNm;
    }

    /**
     * 海外送金の場合:支店名取得<br>
     * <br>
     * 海外送金の場合:支店名を戻り値で返却する<br>
     * <br>
     * @return overseaBranchNm
     */
    public String getOverseaBranchNm() {
        return overseaBranchNm;
    }

    /**
     * 海外送金の場合:支店名設定<br>
     * <br>
     * 海外送金の場合:支店名を引数で設定する<br>
     * <br>
     * @param overseaBranchNm
     */
    public void setOverseaBranchNm(String overseaBranchNm) {
        this.overseaBranchNm = overseaBranchNm;
    }

    /**
     * 海外送金の場合:支店住所取得<br>
     * <br>
     * 海外送金の場合:支店住所を戻り値で返却する<br>
     * <br>
     * @return overseaBranchAddress1
     */
    public String getOverseaBranchAddress1() {
        return overseaBranchAddress1;
    }

    /**
     * 海外送金の場合:支店住所設定<br>
     * <br>
     * 海外送金の場合:支店住所を引数で設定する<br>
     * <br>
     * @param overseaBranchAddress1
     */
    public void setOverseaBranchAddress1(String overseaBranchAddress1) {
        this.overseaBranchAddress1 = overseaBranchAddress1;
    }

    /**
     * 海外送金の場合:支店住所（上記住所欄が一杯のとき）取得<br>
     * <br>
     * 海外送金の場合:支店住所（上記住所欄が一杯のとき）を戻り値で返却する<br>
     * <br>
     * @return overseaBranchAddress2
     */
    public String getOverseaBranchAddress2() {
        return overseaBranchAddress2;
    }

    /**
     * 海外送金の場合:支店住所（上記住所欄が一杯のとき）設定<br>
     * <br>
     * 海外送金の場合:支店住所（上記住所欄が一杯のとき）を引数で設定する<br>
     * <br>
     * @param overseaBranchAddress2
     */
    public void setOverseaBranchAddress2(String overseaBranchAddress2) {
        this.overseaBranchAddress2 = overseaBranchAddress2;
    }

    /**
     * 海外送金の場合:支店が所在する国名取得<br>
     * <br>
     * 海外送金の場合:支店が所在する国名を戻り値で返却する<br>
     * <br>
     * @return overseaCountryBranchExists
     */
    public String getOverseaCountryBranchExists() {
        return overseaCountryBranchExists;
    }

    /**
     * 海外送金の場合:支店が所在する国名設定<br>
     * <br>
     * 海外送金の場合:支店が所在する国名を引数で設定する<br>
     * <br>
     * @param overseaCountryBranchExists
     */
    public void setOverseaCountryBranchExists(String overseaCountryBranchExists) {
        this.overseaCountryBranchExists = overseaCountryBranchExists;
    }

    /**
     * 海外送金の場合:追加情報取得<br>
     * <br>
     * 海外送金の場合:追加情報を戻り値で返却する<br>
     * <br>
     * @return overseaAdditionalInfo
     */
    public String getOverseaAdditionalInfo() {
        return overseaAdditionalInfo;
    }

    /**
     * 海外送金の場合:追加情報設定<br>
     * <br>
     * 海外送金の場合:追加情報を引数で設定する<br>
     * <br>
     * @param overseaAdditionalInfo
     */
    public void setOverseaAdditionalInfo(String overseaAdditionalInfo) {
        this.overseaAdditionalInfo = overseaAdditionalInfo;
    }

    /**
     * 外国送金関係銀行手数料区分取得<br>
     * <br>
     * 外国送金関係銀行手数料区分を戻り値で返却する<br>
     * <br>
     * @return otherRemittanceFeeKbn
     */
    public String getOtherRemittanceFeeKbn() {
        return otherRemittanceFeeKbn;
    }

    /**
     * 外国送金関係銀行手数料区分設定<br>
     * <br>
     * 外国送金関係銀行手数料区分を引数で設定する<br>
     * <br>
     * @param otherRemittanceFeeKbn
     */
    public void setOtherRemittanceFeeKbn(String otherRemittanceFeeKbn) {
        this.otherRemittanceFeeKbn = otherRemittanceFeeKbn;
    }

    /**
     * 海外ペイパル送金の場合:PayPalアドレス取得<br>
     * <br>
     * 海外ペイパル送金の場合:PayPalアドレスを戻り値で返却する<br>
     * <br>
     * @return overseaPlPaypalAddress
     */
    public String getOverseaPlPaypalAddress() {
        return overseaPlPaypalAddress;
    }

    /**
     * 海外ペイパル送金の場合:PayPalアドレス設定<br>
     * <br>
     * 海外ペイパル送金の場合:PayPalアドレスを引数で設定する<br>
     * <br>
     * @param overseaPlPaypalAddress
     */
    public void setOverseaPlPaypalAddress(String overseaPlPaypalAddress) {
        this.overseaPlPaypalAddress = overseaPlPaypalAddress;
    }

    /**
     * 海外ペイパル送金の場合:追加情報取得<br>
     * <br>
     * 海外ペイパル送金の場合:追加情報を戻り値で返却する<br>
     * <br>
     * @return overseaPlAdditionalInfo
     */
    public String getOverseaPlAdditionalInfo() {
        return overseaPlAdditionalInfo;
    }

    /**
     * 海外ペイパル送金の場合:追加情報設定<br>
     * <br>
     * 海外ペイパル送金の場合:追加情報を引数で設定する<br>
     * <br>
     * @param overseaPlAdditionalInfo
     */
    public void setOverseaPlAdditionalInfo(String overseaPlAdditionalInfo) {
        this.overseaPlAdditionalInfo = overseaPlAdditionalInfo;
    }

    /**
     * セールスポイント(スクール記入)取得<br>
     * <br>
     * セールスポイント(スクール記入)を戻り値で返却する<br>
     * <br>
     * @return sellingPoint
     */
    public String getSellingPoint() {
        return sellingPoint;
    }

    /**
     * セールスポイント(スクール記入)設定<br>
     * <br>
     * セールスポイント(スクール記入)を引数で設定する<br>
     * <br>
     * @param sellingPoint
     */
    public void setSellingPoint(String sellingPoint) {
        this.sellingPoint = sellingPoint;
    }

    /**
     * 受講生へのアピールポイント取得<br>
     * <br>
     * 受講生へのアピールポイントを戻り値で返却する<br>
     * <br>
     * @return selfRecommendation
     */
    public String getSelfRecommendation() {
        return selfRecommendation;
    }

    /**
     * 受講生へのアピールポイント設定<br>
     * <br>
     * 受講生へのアピールポイントを引数で設定する<br>
     * <br>
     * @param selfRecommendation
     */
    public void setSelfRecommendation(String selfRecommendation) {
        this.selfRecommendation = selfRecommendation;
    }

    /**
     * 講師画像名取得<br>
     * <br>
     * 講師画像名を戻り値で返却する<br>
     * <br>
     * @return imgPhotoNm
     */
    public String getImgPhotoNm() {
        return imgPhotoNm;
    }

    /**
     * 講師画像名設定<br>
     * <br>
     * 講師画像名を引数で設定する<br>
     * <br>
     * @param imgPhotoNm
     */
    public void setImgPhotoNm(String imgPhotoNm) {
        this.imgPhotoNm = imgPhotoNm;
    }

    /**
     * 講師画像取得<br>
     * <br>
     * 講師画像を戻り値で返却する<br>
     * <br>
     * @return imgPhoto
     */
    public Blob getImgPhoto() {
        return imgPhoto;
    }

    /**
     * 講師画像設定<br>
     * <br>
     * 講師画像を引数で設定する<br>
     * <br>
     * @param imgPhoto
     */
    public void setImgPhoto(Blob imgPhoto) {
        this.imgPhoto = imgPhoto;
    }

    /**
     * スクール側からのコメント(講師公開)取得<br>
     * <br>
     * スクール側からのコメント(講師公開)を戻り値で返却する<br>
     * <br>
     * @return evaluationFromSchoolCmt1
     */
    public String getEvaluationFromSchoolCmt1() {
        return evaluationFromSchoolCmt1;
    }

    /**
     * スクール側からのコメント(講師公開)設定<br>
     * <br>
     * スクール側からのコメント(講師公開)を引数で設定する<br>
     * <br>
     * @param evaluationFromSchoolCmt1
     */
    public void setEvaluationFromSchoolCmt1(String evaluationFromSchoolCmt1) {
        this.evaluationFromSchoolCmt1 = evaluationFromSchoolCmt1;
    }

    /**
     * スクール側からのコメント(講師非公開)取得<br>
     * <br>
     * スクール側からのコメント(講師非公開)を戻り値で返却する<br>
     * <br>
     * @return evaluationFromSchoolCmt2
     */
    public String getEvaluationFromSchoolCmt2() {
        return evaluationFromSchoolCmt2;
    }

    /**
     * スクール側からのコメント(講師非公開)設定<br>
     * <br>
     * スクール側からのコメント(講師非公開)を引数で設定する<br>
     * <br>
     * @param evaluationFromSchoolCmt2
     */
    public void setEvaluationFromSchoolCmt2(String evaluationFromSchoolCmt2) {
        this.evaluationFromSchoolCmt2 = evaluationFromSchoolCmt2;
    }

    /**
     * 最新の受講生から講師へのコメント取得<br>
     * <br>
     * 最新の受講生から講師へのコメントを戻り値で返却する<br>
     * <br>
     * @return latestEvaluationFromStudentCmt
     */
    public String getLatestEvaluationFromStudentCmt() {
        return latestEvaluationFromStudentCmt;
    }

    /**
     * 最新の受講生から講師へのコメント設定<br>
     * <br>
     * 最新の受講生から講師へのコメントを引数で設定する<br>
     * <br>
     * @param latestEvaluationFromStudentCmt
     */
    public void setLatestEvaluationFromStudentCmt(String latestEvaluationFromStudentCmt) {
        this.latestEvaluationFromStudentCmt = latestEvaluationFromStudentCmt;
    }

    /**
     * 備考(講師は見えません)取得<br>
     * <br>
     * 備考(講師は見えません)を戻り値で返却する<br>
     * <br>
     * @return remark
     */
    public String getRemarkT() {
        return remarkT;
    }

    /**
     * 備考(講師は見えません)設定<br>
     * <br>
     * 備考(講師は見えません)を引数で設定する<br>
     * <br>
     * @param remark
     */
    public void setRemarkT(String remark) {
        this.remarkT = remark;
    }

    /**
     * レコードバージョン番号取得<br>
     * <br>
     * レコードバージョン番号を戻り値で返却する<br>
     * <br>
     * @return recordVerNo
     */
    public int getRecordVerNoT() {
        return recordVerNoT;
    }

    /**
     * レコードバージョン番号設定<br>
     * <br>
     * レコードバージョン番号を引数で設定する<br>
     * <br>
     * @param recordVerNo
     */
    public void setRecordVerNoT(int recordVerNo) {
        this.recordVerNoT = recordVerNo;
    }

    /**
     * 登録日時取得<br>
     * <br>
     * 登録日時を戻り値で返却する<br>
     * <br>
     * @return insertDttm
     */
    public Timestamp getInsertDttmT() {
        return insertDttmT;
    }

    /**
     * 登録日時設定<br>
     * <br>
     * 登録日時を引数で設定する<br>
     * <br>
     * @param insertDttm
     */
    public void setInsertDttmT(Timestamp insertDttm) {
        this.insertDttmT = insertDttm;
    }

    /**
     * 登録者コード取得<br>
     * <br>
     * 登録者コードを戻り値で返却する<br>
     * <br>
     * @return insertCd
     */
    public String getInsertCdT() {
        return insertCdT;
    }

    /**
     * 登録者コード設定<br>
     * <br>
     * 登録者コードを引数で設定する<br>
     * <br>
     * @param insertCd
     */
    public void setInsertCdT(String insertCd) {
        this.insertCdT = insertCd;
    }

    /**
     * 更新日時取得<br>
     * <br>
     * 更新日時を戻り値で返却する<br>
     * <br>
     * @return updateDttm
     */
    public Timestamp getUpdateDttmT() {
        return updateDttmT;
    }

    /**
     * 更新日時設定<br>
     * <br>
     * 更新日時を引数で設定する<br>
     * <br>
     * @param updateDttm
     */
    public void setUpdateDttmT(Timestamp updateDttm) {
        this.updateDttmT = updateDttm;
    }

    /**
     * 更新者コード取得<br>
     * <br>
     * 更新者コードを戻り値で返却する<br>
     * <br>
     * @return updateCd
     */
    public String getUpdateCdT() {
        return updateCdT;
    }

    /**
     * 更新者コード設定<br>
     * <br>
     * 更新者コードを引数で設定する<br>
     * <br>
     * @param updateCd
     */
    public void setUpdateCdT(String updateCd) {
        this.updateCdT = updateCd;
    }

    /**
     * リターンコード取得<br>
     * <br>
     * リターンコードを戻り値で返却する<br>
     * <br>
     * @return returnCode
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * リターンコード設定<br>
     * <br>
     * リターンコードを引数で設定する<br>
     * <br>
     * @param returnCode
     */
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * 利用者名(フリガナ)(姓)と(名）取得<br>
     * <br>
     * 利用者名(フリガナ)(姓)と(名）を戻り値で返却する<br>
     * <br>
     * @return userKnm
     */
    public String getUserKnm() {
        return userKnm;
    }

    /**
     * 利用者名(フリガナ)(姓)と(名）設定<br>
     * <br>
     * 利用者名(フリガナ)(姓)と(名）を引数で設定する<br>
     * <br>
     * @param userKnm
     */
    public void setUserKnm(String userKnm) {
        this.userKnm = userKnm;
    }

    /**
     * 性別区分名取得<br>
     * <br>
     * 性別区分名を戻り値で返却する<br>
     * <br>
     * @return genderKbnNm
     */
    public String getGenderKbnNm() {
        return genderKbnNm;
    }

    /**
     * 性別区分名設定<br>
     * <br>
     * 性別区分名を引数で設定する<br>
     * <br>
     * @param genderKbnNm
     */
    public void setGenderKbnNm(String genderKbnNm) {
        this.genderKbnNm = genderKbnNm;
    }

    /**
     * ブックマーク取得<br>
     * <br>
     * ブックマークを戻り値で返却する<br>
     * <br>
     * @return bookmark
     */
    public String getBookmark() {
        return bookmark;
    }

    /**
     * ブックマーク設定<br>
     * <br>
     * ブックマークを引数で設定する<br>
     * <br>
     * @param bookmark
     */
    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    /**
     * 講師別コースマスタ(+コースマスタ)DTO取得<br>
     * <br>
     * 講師別コースマスタ(+コースマスタ)DTOを戻り値で返却する<br>
     * <br>
     * @return teacherCourseDtoList
     */
    public List<TeacherCourseDto> getTeacherCourseDtoList() {
        return teacherCourseDtoList;
    }

    /**
     * 講師別コースマスタ(+コースマスタ)DTO設定<br>
     * <br>
     * 講師別コースマスタ(+コースマスタ)DTOを引数で設定する<br>
     * <br>
     * @param teacherCourseDtoList
     */
    public void setTeacherCourseDtoList(List<TeacherCourseDto> teacherCourseDtoList) {
        this.teacherCourseDtoList = teacherCourseDtoList;
    }


    // 2014/04/22 Add Start 検索条件の追加(コース名)対応
    /**
     * 大分類コード取得<br>
     * <br>
     * 大分類コードを戻り値で返却する<br>
     * <br>
     * @return bigClassificationCd
     */
    public String getBigClassificationCd() {
        return bigClassificationCd;
    }

    /**
     * 大分類コード設定<br>
     * <br>
     * 大分類コードを引数で設定する<br>
     * <br>
     * @param bigClassificationCd
     */
    public void setBigClassificationCd(String bigClassificationCd) {
        this.bigClassificationCd = bigClassificationCd;
    }

    /**
     * 中分類コード取得<br>
     * <br>
     * 中分類コードを戻り値で返却する<br>
     * <br>
     * @return middleClassificationCd
     */
    public String getMiddleClassificationCd() {
        return middleClassificationCd;
    }

    /**
     * 中分類コード設定<br>
     * <br>
     * 中分類コードを引数で設定する<br>
     * <br>
     * @param middleClassificationCd
     */
    public void setMiddleClassificationCd(String middleClassificationCd) {
        this.middleClassificationCd = middleClassificationCd;
    }

    /**
     * 小分類コード取得<br>
     * <br>
     * 小分類コードを戻り値で返却する<br>
     * <br>
     * @return smallClassificationCd
     */
    public String getSmallClassificationCd() {
        return smallClassificationCd;
    }

    /**
     * 小分類コード設定<br>
     * <br>
     * 小分類コードを引数で設定する<br>
     * <br>
     * @param smallClassificationCd
     */
    public void setSmallClassificationCd(String smallClassificationCd) {
        this.smallClassificationCd = smallClassificationCd;
    }

    /**
     * コース名取得<br>
     * <br>
     * コース名を戻り値で返却する<br>
     * <br>
     * @return courseJnm
     */
    public String getCourseJnm() {
        return courseJnm;
    }

    /**
     * コース名設定<br>
     * <br>
     * コース名を引数で設定する<br>
     * <br>
     * @param courseJnm
     */
    public void setCourseJnm(String courseJnm) {
        this.courseJnm = courseJnm;
    }

    // 2014/04/22 Add End   検索条件の追加(コース名)対応
}
