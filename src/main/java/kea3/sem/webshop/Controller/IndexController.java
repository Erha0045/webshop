package kea3.sem.webshop.Controller;

import kea3.sem.webshop.Model.Product;
import kea3.sem.webshop.Service.ProductService;
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
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Product product){
        productService.create(product);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") long id, Model model){
        model.addAttribute("product", productService.read(id));
        return ("update");
    }
    //update product
    @PostMapping ("/update")
    public String update(@ModelAttribute Product product){
        //update by using update service
        productService.update(product);
        return "redirect:/";
    }

    //delete product
    @GetMapping ("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        productService.delete(id);
        return "redirect:/";
    }

}
