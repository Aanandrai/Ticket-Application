package org.ticketBooking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ticketBooking.entities.User;
import org.ticketBooking.util.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class UserBookingService {


    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USER_FILE_PATH="../localDb/user.json";

//    public UserBookingService(User user1) throws IOException
//    {
//        this.user=user1;
//
//        File users= new File(USER_PATH);
//
//        userList=objectMapper.readValue(users , new TypeReference<List<User>>(){});
//    }

    public UserBookingService(User user) throws IOException {
        this.user = user;
        loadUserListFromFile();
    }


    public UserBookingService() throws IOException {
        loadUserListFromFile();
    }

    public void loadUserListFromFile() throws IOException {
        userList = objectMapper.readValue(new File(USER_FILE_PATH), new TypeReference<List<User>>(){});
    }

    public Boolean loginUser(){
        Optional<User> foundUser =userList.stream().filter(user1 ->{
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(),user1.getHashedPassword());
        }).findFirst();

        return foundUser.isPresent();
    }

    public Boolean signUp(User user1){
        try{
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        }catch(IOException ex){
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException{
        File usersFile =new File(USER_FILE_PATH);
        objectMapper.writeValue(usersFile , userList);
    }

    public void fetchBookings(){
        Optional<User> userFetched = userList.stream().filter(user1->{
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getHashedPassword());
        }).findFirst();

        if(userFetched.isPresent()){
            userFetched.get().printTickets();
        }
    }

}
