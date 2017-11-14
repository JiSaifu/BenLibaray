package benjamin.lib.ex.unitils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Unitilsテスト用クラス
 */
@AllArgsConstructor
@SuppressWarnings("unused")
public class User {
    /** ユーザ名 */
    @Setter @Getter
    private String name;

    /** パスワード */
    @Getter @Setter
    private String password;

    /** 趣味
     *  用于lenient_order属性的测试
     *  用于assertLenientEquals方法的测试
     */
    @Getter @Setter
    private String[] hobby;

    @Getter @Setter
    private Date registryDate;
}
