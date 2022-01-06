package summonerswar.summonerswarspring.monster;

import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

@Repository
public class JdbcMonsterRepository implements MonsterRepository{

    private DataSource dataSource;

    public JdbcMonsterRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public Monster save(Monster monster) {
        return null;
    }

    @Override
    public Optional<Monster> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Monster> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Monster> findAll() {
        return null;
    }
}
