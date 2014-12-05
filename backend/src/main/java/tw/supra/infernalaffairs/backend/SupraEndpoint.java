package tw.supra.infernalaffairs.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

/**
 * Created by supra on 14-12-5.
 */
@Api(name = "supraApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.infernalaffairs.supra.tw", ownerName = "backend.infernalaffairs.supra.tw", packagePath = ""))
class SupraEndpoint {
    @ApiMethod(name = "sayHi")
    public SupraBean sayHi(@Named("name") String name){
        SupraBean response = new SupraBean();

        response.setData("hi, " + name);
        return  response;
    }
}
