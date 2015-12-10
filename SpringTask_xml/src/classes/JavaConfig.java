package classes;



import org.springframework.context.annotation.*;


/**
 * Created by Артём on 8.12.2015.
 */
@Configuration
@ComponentScan(basePackages = "classes.*")
class JavaConfig {

    @Bean
    public Contact contact1(){
        return new Contact("Artem", 15);
    }
    @Bean
    public Contact contact2(){
        return new Contact("Vasya", 21);
    }
    @Bean
    public Contact contact3(){
        return new Contact("Petya", 22);
    }
    @Bean
    public Contact contact4(){
        Contact contact2 = new Contact();
        contact2.setName("Kris");
        contact2.setAge(23);
        return contact2;
    }
    @Bean
    public ContactsDAO contactsDAO(){

        return new ContactsDAO();
    }


}
