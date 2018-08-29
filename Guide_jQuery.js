
import * as $ from 'jQuery'; //this is how you import jQuery inside a component of Angular 

"../node_modules/jquery/dist/jquery.min.js" //also never forguet to add this inside the angular json file, in scripts

//after that, you are setup to use jQuery inside the specified component


    $(document).ready(function(){
      $('a').click(function(){
        $('ul.items li').slideDown("slow")
      }) 
    }); //this is the basic jQuery syntax using click and slidedown
    
    $(document).ready(function(){
      $('a').click(function(){
        $('ul.items li').css("font-size","50px")
      }) 
    }); //this is another example, but using the css editor prom jquery
