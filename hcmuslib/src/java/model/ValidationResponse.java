/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.List;
/**
 *
 * @author Shady
 */
public class ValidationResponse {
    private String status;
    private List errorMessageList;

    public String getStatus() {
      return status;
    }
    public void setStatus(String status) {
      this.status = status;
    }
    public List getErrorMessageList() {
      return this.errorMessageList;
    }
    public void setErrorMessageList(List errorMessageList) {
      this.errorMessageList = errorMessageList;
    }
}
