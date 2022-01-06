package summonerswar.summonerswarspring.monster;

import java.util.List;
import java.util.Optional;

public interface MonsterRepository {

    Monster save(Monster monster);
    Optional<Monster> findById(Long id);
    Optional<Monster> findByName(String name);
    List<Monster> findAll();
}
