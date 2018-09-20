/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.catedevman.hellojava;

import com.amazonaws.services.lambda.runtime.Context;

/**
 *
 * @author developer
 */
public class LambdaMethodHandler {
    public String handleRequest(Request request, Context context) {
        return "Hello World - " + request.firstName + " " + request.lastName;
    }
}
