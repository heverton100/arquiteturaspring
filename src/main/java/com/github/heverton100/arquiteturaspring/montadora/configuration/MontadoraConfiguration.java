package com.github.heverton100.arquiteturaspring.montadora.configuration;

import com.github.heverton100.arquiteturaspring.montadora.Motor;
import com.github.heverton100.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado() {
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("AS-50");
        motor.setLitragem(1.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(130);
        motor.setCilindros(3);
        motor.setModelo("EL-10");
        motor.setLitragem(1.6);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Primary
    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setModelo("TR-30");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
