import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  photos = [

    {
      url: "https://haste.net/wp-content/uploads/2017/12/Haste-Battlefield-1-Cover-241x300.jpg",
      description: "Battlefield 1"
    },
    {
      url: "https://images-na.ssl-images-amazon.com/images/I/81nJHwLsN%2BL._SL1500_.jpg",
      description: "Overwatch"
    },
    {
      url: "http://www.mobygames.com/images/covers/l/434577-super-mario-odyssey-nintendo-switch-front-cover.jpg",
      description: "Mario Odyssey"
    },
    {
      url: "http://www.thesavepoints.com/wp-content/uploads/Splatoon_2_artwork.jpg",
      description: "Splatoon 2"
    },
    {
      url: "https://upload.wikimedia.org/wikipedia/en/thumb/c/c6/The_Legend_of_Zelda_Breath_of_the_Wild.jpg/220px-The_Legend_of_Zelda_Breath_of_the_Wild.jpg",
      description: "Breath of the Wild"
    },
    {
      url: "https://doomwiki.org/w/images/2/26/Doom_Cover_Revenant.jpg",
      description: "Doom"
    }

  ];

}
