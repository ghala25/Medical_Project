
package mp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Rayda
 */
public class GeneralCourse extends Service {

 
    /*لأنها دورة عامة ومجانية تكون متوفرة بأكثر من لغة والمستخدم يختار */
    
    private String[] language = { "French", "Arabic", "English", "German" };

    /*الوراثة*/



    public GeneralCourse(){
        
     super();  
    }

    /* تطبع اللغات للمستخد بشكل متتالي */
    public void printLanguage() {
        for (String lang : language) {
            System.out.println(lang);
        }
    }


    @Override
    public void infoService() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
