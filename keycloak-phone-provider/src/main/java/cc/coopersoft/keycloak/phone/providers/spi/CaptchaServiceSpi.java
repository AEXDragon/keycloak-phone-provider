package cc.coopersoft.keycloak.phone.providers.spi;

import org.keycloak.provider.Provider;
import org.keycloak.provider.ProviderFactory;
import org.keycloak.provider.Spi;

public class CaptchaServiceSpi implements Spi {
    @Override
    public boolean isInternal() {
        return false;
    }

    @Override
    public String getName() {
        return "captchaService";
    }

    @Override
    public Class<? extends Provider> getProviderClass() {
        return CaptchaService.class;
    }

    @Override
    public Class<? extends ProviderFactory> getProviderFactoryClass() {
        return CaptchaServiceProviderFactory.class;
    }
}
