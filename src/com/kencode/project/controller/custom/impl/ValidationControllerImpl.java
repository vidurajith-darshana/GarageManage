/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.ValidationController;

/**
 *
 * @author Vidura
 */
public class ValidationControllerImpl implements ValidationController{

    @Override
    public boolean setNumberFormat(String text) throws Exception {

        char[] number=text.toCharArray();
        int count=0;
        for(int i=0;i<number.length;i++){
            if(number[i]=='1'||number[i]=='2'||number[i]=='3'||number[i]=='4'||number[i]=='5'||number[i]=='6'||number[i]=='7'||number[i]=='8'||number[i]=='9'||number[i]=='0'||number[i]==' '){
                count++;
                
            }
        }
        if(count==number.length){
            return true;
        }
        return false;

    }
    
}
