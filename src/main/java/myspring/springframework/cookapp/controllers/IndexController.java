package myspring.springframework.cookapp.controllers;

import myspring.springframework.cookapp.domain.Category;
import myspring.springframework.cookapp.domain.UnitOfMeasure;
import myspring.springframework.cookapp.repositories.CategoryRepository;
import myspring.springframework.cookapp.repositories.UnitOfMeasureRepository;
import myspring.springframework.cookapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    //private CategoryRepository categoryRepository;
    //private UnitOfMeasureRepository unitOfMeasureRepository;

    /*
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }
    */

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        /*
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Cat Id is " + categoryOptional.get().getId());
        System.out.println("UOM Id is " + unitOfMeasureOptional.get().getId());
        */

        model.addAttribute("recipes", recipeService.getRecipes()) ;
        return "index";
    }
}
