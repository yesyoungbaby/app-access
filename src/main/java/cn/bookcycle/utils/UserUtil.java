package cn.bookcycle.utils;

/**
 * @author yesyoungbaby
 * @Title: UserUtil
 * @ProjectName app-access
 * @Description: TODO
 * @date 2019/1/2321:32
 */
public class UserUtil {

    private static Long userId;

    public static Long getUserId() {
        return userId;
    }

    public static void setUserId(Long userId) {
        UserUtil.userId = userId;
    }
}
