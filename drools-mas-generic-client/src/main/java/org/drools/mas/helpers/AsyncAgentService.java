
package org.drools.mas.helpers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.jws.HandlerChain;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AsyncAgentService", targetNamespace = "http://mas.drools.org/")
@HandlerChain(file="handler-chain.xml")
public class AsyncAgentService
    extends Service
{

    

    public AsyncAgentService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

   

    /**
     * 
     * @return
     *     returns AsyncDroolsAgentService
     */
    @WebEndpoint(name = "AsyncAgentServicePort")
    public AsyncDroolsAgentService getAsyncAgentServicePort() {
        return super.getPort(new QName("http://mas.drools.org/", "AsyncAgentServicePort"), AsyncDroolsAgentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AsyncDroolsAgentService
     */
    @WebEndpoint(name = "AsyncAgentServicePort")
    public AsyncDroolsAgentService getAsyncAgentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mas.drools.org/", "AsyncAgentServicePort"), AsyncDroolsAgentService.class, features);
    }

}
