package it.leo.facebook;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Version;
import com.restfb.scope.FacebookPermissions;
import com.restfb.scope.ScopeBuilder;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ScopeBuilder scopeBuilder = new ScopeBuilder();
        scopeBuilder.addPermission(FacebookPermissions.MANAGE_PAGES);
        FacebookClient client = new DefaultFacebookClient(Version.VERSION_2_6);
        String loginDialogUrlString = client.getLoginDialogUrl(appId, redirectUrl, scopeBuilder);

        // Tells Facebook to extend the lifetime of MY_ACCESS_TOKEN.
// Facebook may return the same token or a new one.

        AccessToken accessToken =
                new DefaultFacebookClient().obtainExtendedAccessToken(MY_APP_ID,
                        MY_APP_SECRET, MY_ACCESS_TOKEN);

        out.println("My extended access token: " + accessToken);
    }
}
