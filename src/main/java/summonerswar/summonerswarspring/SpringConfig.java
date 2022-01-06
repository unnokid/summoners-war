package summonerswar.summonerswarspring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import summonerswar.summonerswarspring.monster.JdbcMonsterRepository;
import summonerswar.summonerswarspring.monster.MonsterRepository;
import summonerswar.summonerswarspring.monster.MonsterService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MonsterService monsterService(MonsterRepository monsterRepository){
        return new MonsterService(monsterRepository());
    }

    @Bean
    public MonsterRepository monsterRepository(){
        return new JdbcMonsterRepository(dataSource);
    }
}
