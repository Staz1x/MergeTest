package se.nackademin.item.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.nackademin.item.model.Item;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {

    List<Item> findAll();
    List<Item> findAllByName(String name);


}
