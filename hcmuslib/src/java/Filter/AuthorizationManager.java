/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filter;
import entity.*;

public interface AuthorizationManager {

    public boolean isUserAuthorized(UserPassword user, String uri);

}
