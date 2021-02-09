package Controller;

import Model.Product;
import Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("produ",productService.readAll());
        return ("index");
    }

    @GetMapping("/create")
    public String create(){
        return ("create");
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product produ){
        productService.create(produ);
        return "redirect:/";
    }
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model){
        model.addAttribute("produ", productService.read(id));
        return "update";
    }

    //update product
    @PostMapping ("/update")
    public String update(@ModelAttribute Product produ){
        //update by using update service
        productService.update(produ);
        return "redirect:/";
    }
    //delete product
    @GetMapping ("/delete/{id}")
    public String delete(@PathVariable("id") long id, Model model){
        productService.delete(id);
        return "redirect:/";
    }

}
