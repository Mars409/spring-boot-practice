package top.zh;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import top.zh.model.User;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private List<User> userList = new ArrayList<>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("users", userList);
        return "index";
    }

    @GetMapping("/new")
    public String showUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "userForm";
    }

    @PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        userList.add(user);
        return "redirect:/";
    }

    public List<User> getUserList() {
        return userList;
    }
    public void setUserList(List<User> userList) {
        this.userList = userList;

    }
}