/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package restfulclient;

import client.RestClient;

/**
 *
 * @author Administrator
 */
public class RestfulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RestClient rfc=new RestClient();
        System.out.println(rfc.getHtml());
        rfc.putHtml("call from the Restful client");
    }
}
