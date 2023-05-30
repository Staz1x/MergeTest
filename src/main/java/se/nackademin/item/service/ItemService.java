package se.nackademin.item.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.nackademin.item.model.Item;
import se.nackademin.item.repository.ItemRepository;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository repository;

    public List<Item> getAllItems() {
        return repository.findAll();
    }

    public Item getItemById(Long id) {
        return repository.findById(id).get();
    }
}
