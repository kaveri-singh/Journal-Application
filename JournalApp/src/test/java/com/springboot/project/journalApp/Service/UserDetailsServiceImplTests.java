//package com.springboot.project.journalApp.Service;
//
//import com.springboot.project.journalApp.entity.User;
//import com.springboot.project.journalApp.repository.UserRepository;
//import com.springboot.project.journalApp.service.UserDetailsServiceImpl;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//
//import static org.mockito.Mockito.*;
//
//
//public class UserDetailsServiceImplTests {
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeAll
//    void setUp(){
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    void loadUserByUsernameTests(){
//        User mockUser = new User();
//        mockUser.setUserName("Olly");
//        mockUser.setPassword("abc");
//        mockUser.setRoles(new ArrayList<>());
//
//        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
//                .thenReturn(mockUser);
//
//        UserDetails user = userDetailsService.loadUserByUsername("Olly");
//        Assertions.assertNotNull(user);
//        Assertions.assertEquals("Olly", user.getUsername());
//    }
//
//}
