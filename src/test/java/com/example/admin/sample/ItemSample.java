package com.example.admin.sample;

import com.example.admin.AdminApplicationTests;
import com.example.admin.AdminApplicationTests;
import com.example.admin.model.entity.Category;
import com.example.admin.model.entity.Item;
import com.example.admin.model.entity.Partner;
import com.example.admin.model.enumclass.ItemStatus;
import com.example.admin.repository.CategoryRepository;
import com.example.admin.repository.ItemRepository;
import com.example.admin.repository.PartnerRepository;
import com.example.admin.repository.CategoryRepository;
import com.example.admin.repository.ItemRepository;
import com.example.admin.repository.PartnerRepository;
//import com.sun.xml.internal.ws.util.CompletedFuture;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Slf4j
public class ItemSample extends AdminApplicationTests {

    private Random random = new Random();

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private PartnerRepository partnerRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    public void createAll(){
        createHomeAppliance();
        createClothing();
        createMultiShop();
        createInterior();
        createFood();
        createSports();
        createShoppingMall();
        createDutyFree();
        createBeauty();
    }


    @Test
    public void createHomeAppliance(){
        String type = "COMPUTER";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ????????????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ????????????"+i+"???"+"??? ???????????? ?????????. 2019?????? ????????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();

                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createClothing(){

        String type = "CLOTHING";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ????????????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ????????????"+i+"???"+"??? ?????? ?????? ?????????. 2029?????? ????????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createMultiShop(){

        String type = "MULTI_SHOP";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? XX ??????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? XX ??????"+i+"???"+"??? ???????????? ?????? ?????????. 2021?????? ????????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createInterior(){

        String type = "INTERIOR";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ??????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ??????"+i+"???"+"??? ????????? ????????????. 2023?????? ????????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createFood(){

        String type = "FOOD";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ??????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ??????"+i+"???"+"??? ?????? ????????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createSports(){

        String type = "SPORTS";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ?????? ?????????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ?????? ?????????"+i+"???"+"??? ?????? ?????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    @Test
    public void createShoppingMall(){

        String type = "SHOPPING_MALL";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? OO ??????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? OO??????"+i+"???"+"??? EE ?????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createDutyFree(){

        String type = "DUTY_FREE";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? ????????????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(999999)+1))
                        .content(p.getName()+"??? ????????????"+i+"???"+"??? ?????? ?????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }


    @Test
    public void createBeauty(){

        String type = "BEAUTY";
        Category category = categoryRepository.findByType(type).get();
        List<Partner> partnerList = partnerRepository.findByCategory(category);

        for(Partner p : partnerList){

            for(int i = 1 ; i < 6; i ++){
                int div = (random.nextInt(10)+1) % 2;
                ItemStatus status = (div == 0 ? ItemStatus.REGISTERED : ItemStatus.UNREGISTERED);

                Item item = Item.builder()
                        .partner(p)
                        .status(status)
                        .name(category.getTitle()+i+"???")
                        .title(p.getName()+"??? OO ?????????"+i+"???")
                        .price(BigDecimal.valueOf((long)random.nextInt(99999)+1))
                        .content(p.getName()+"??? OO ?????????"+i+"???"+"??? ?????? ?????????")
                        .brandName(p.getName())
                        .registeredAt(getRandomDate())
                        .unregisteredAt(status.equals(ItemStatus.UNREGISTERED) ? getRandomDate() : null )
                        .build();
                itemRepository.save(item);
            }
        }
    }

    private LocalDateTime getRandomDate(){
        return LocalDateTime.of(2019,getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber(),getRandomNumber());
    }

    private int getRandomNumber(){
        return random.nextInt(11)+1;
    }
}
