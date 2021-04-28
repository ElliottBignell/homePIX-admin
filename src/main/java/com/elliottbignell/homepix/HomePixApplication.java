package com.elliottbignell.homepix;

import com.elliottbignell.homepix.generated.GeneratedHomePixApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * An {@link com.speedment.runtime.core.ApplicationBuilder} interface for the
 * {@link com.speedment.runtime.config.Project} named innodb.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author Elliott Bignell
 */
@SpringBootApplication
public interface HomePixApplication extends GeneratedHomePixApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomePixApplication.class, args);
    }
}
