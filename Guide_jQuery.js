
import * as $ from 'jQuery'; //this is how you import jQuery inside a component of Angular 

"../node_modules/jquery/dist/jquery.min.js" //also never forguet to add this inside the angular json file, in scripts

//after that, you are setup to use jQuery inside the specified component


    $('h2').text('Hello World'); //This is how you put text in a web page, all the h2 will be changed into "hello world"


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


    $(document).ready(function()
    {
        var quantity = 1;

      $('a.qtt').text(quantity);

      $('.add').click(function()
      {
        quantity++;
        $('a.qtt').text(quantity);
      }) 

      $('.rem').click(function()
      {
        if (quantity > 1)
        quantity--;

        $('a.qtt').text(quantity);
      }) 

    }); //This is an example of how I implemented a button counter in a page

    .html()//This is just like text, but will accept tags

    .addClass('classname')//This will add a class to the specified $(), wich you can add lots of css styling with normal css

    $("a").attr("href", "https://en.wikipedia.org/wiki/Crocodile"); //This is how you change an atribute


        var newP = $("<p>");
        newP.text("some text"); //In this example, jQuery created a new paraph for the page,
        newP.addClass("class"); //and since it is appended to body, it will be the vary last 
        $("body").append(newP); //thing to show before the 'body' tag closes

 
