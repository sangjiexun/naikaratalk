package com.naikara_talk.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

import com.opensymphony.xwork2.validator.ValidationException;
import com.opensymphony.xwork2.validator.validators.FieldValidatorSupport;

/**
 * 英字（記号を含まない）チェック
 *
 * @author tecs
 * @version 1.0
 */
public class EnValidator extends FieldValidatorSupport {

    /**
     * 入力値に対してトリムを行わない場合は true.
     */
    private boolean doTrim = false;

    /**
     * 入力値に対してトリムを行うかを取得します.
     *
     * @return 入力値に対してトリムを行う場合は true.
     */
    public boolean isDoTrim() {
        return doTrim;
    }

    /**
     * 入力値に対してトリムを行うかを設定します.
     *
     * @param doTrim
     *            入力値に対してトリムを行う場合は true.
     */
    public void setDoTrim(boolean doTrim) {
        this.doTrim = doTrim;
    }

    /**
     * 英字（記号を含まない）のチェック
     *
     * @param Object
     *
     * @return なし
     *
     * @exception ValidationException
     */
    @Override
    public void validate(Object object) throws ValidationException {

        // フィールド名を取得
        final String fieldName = getFieldName();

        // フィールド値を取得
        String fieldValue = (String) getFieldValue(fieldName, object);

        // トリムを行う場合はトリムを実行
        if (doTrim && fieldValue != null) {
            fieldValue = fieldValue.trim();
        }

        // 入力されていない場合は処理を抜ける
        if (StringUtils.isEmpty(fieldValue)) {
            return;
        }

        // ファーマットチェック
        String expression = "^[^ ]+[a-zA-Z 1-9.]*[^ ]";
        Pattern pattern;
        pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(fieldValue);
        if (!matcher.matches()) {
            this.addFieldError(fieldName, object);
        }

    }
}
