/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;

import entity.UserPassword;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Pattern;
import org.hibernate.cfg.Environment;

public class AuthorizationManagerDefaultImpl implements AuthorizationManager {

    private Properties roleMappings;

    /**
     * Load mappings from a properties file on the file system.
     */
    public AuthorizationManagerDefaultImpl() {
        //Read in properties file containing role mappings...
        this.roleMappings = new Properties();
        try {
            this.roleMappings.load(new FileInputStream("./mapping.properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns boolean indicating whether user has the appropriate role for the
     * specified URI.
     *
     */
    @Override
    public boolean isUserAuthorized(UserPassword user, String uri) {

        boolean matchFound = false;
        boolean authorized = false;

        Iterator i = roleMappings.entrySet().iterator();

        //Loop through user roles, exit once match is found.
        while ((!authorized) && (i.hasNext())) {
            Map.Entry me = (Map.Entry) i.next();

            //Pattern match.  '*' should be interpreted as a wildcard for any ASCII character.
            String mapPattern = ((String) me.getValue()).replaceAll("\\*", ".*");
            matchFound = Pattern.matches(mapPattern, uri);

            if (matchFound && user.getWebpagesRoles().getRoleName().contains(me.getKey().toString())) {
                authorized = true;
            }
        }
        return authorized;
    }

}
