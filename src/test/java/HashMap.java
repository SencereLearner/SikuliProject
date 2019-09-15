public class HashMap {

  public static java.util.HashMap<String, String> getUserLoginInfo(){
    java.util.HashMap<String, String> userLogin = new java.util.HashMap<String, String>();
    userLogin.put("user1", "login1_password1");
    userLogin.put("user2", "login2_password1");
    userLogin.put("user3", "login3_password1");
    return userLogin;
  }

  public static java.util.HashMap<Integer, String> getUserDOB(){
    java.util.HashMap<Integer, String> userDOB = new java.util.HashMap<Integer, String>();
    userDOB.put(1, "January");
    userDOB.put(2, "February");
    userDOB.put(3, "March");
    userDOB.put(4, "April");
    userDOB.put(5, "May");
    return userDOB;
  }



}
