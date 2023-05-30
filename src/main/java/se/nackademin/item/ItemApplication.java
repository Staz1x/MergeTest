package se.nackademin.item;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import se.nackademin.item.model.Item;
import se.nackademin.item.repository.ItemRepository;

@SpringBootApplication
public class ItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ItemApplication.class, args);
    }

    @Bean
    public CommandLineRunner pojo(ItemRepository itemRepository){
        return arg -> {
            itemRepository.save(Item.builder().balance(1200).price(1500).name("hoodie").build());
            itemRepository.save(Item.builder().balance(1211).price(700).name("pants").build());
            itemRepository.save(Item.builder().balance(1222).price(350).name("t-shirt").build());
            itemRepository.save(Item.builder().balance(1233).price(500).name("allover").build());
            itemRepository.save(Item.builder().balance(1244).price(700).name("hat").build());
            itemRepository.save(Item.builder().balance(1255).price(950).name("shoes").build());
            itemRepository.save(Item.builder().balance(1266).price(300).name("blouse").build());
            itemRepository.save(Item.builder().balance(1277).price(650).name("t-shirt").build());
            itemRepository.save(Item.builder().balance(1288).price(780).name("jacket").build());
            itemRepository.save(Item.builder().balance(1299).price(200).name("top").build());
            itemRepository.save(Item.builder().balance(1311).price(750).name("jumpsuits").build());
            itemRepository.save(Item.builder().balance(1322).price(900).name("watch").build());
            itemRepository.save(Item.builder().balance(1333).price(500).name("blouse").build());
            itemRepository.save(Item.builder().balance(1344).price(200).name("socks").build());
        };
    }
}
