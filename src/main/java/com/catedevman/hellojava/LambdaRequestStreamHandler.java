/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catedevman.hellojava;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author developer
 */
public class LambdaRequestStreamHandler implements RequestStreamHandler {
    @Override
    public void handleRequest(InputStream inputStream, 
      OutputStream outputStream, Context context) {
        String input = inputStream.toString();
        try {
            outputStream.write(("Hello World - " + input).getBytes());
        } catch (IOException ex) {
            Logger.getLogger(LambdaRequestStreamHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}