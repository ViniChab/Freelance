#include <stdio.h>
#include <allegro5/allegro.h>
#include <allegro5/allegro_primitives.h>

int setWindow();   //Assinatura
int finalizar();   //Assinatura
int inicializar(); //Assinatura
void clear(); //Assinatura

ALLEGRO_DISPLAY *window = NULL;
//janela é global, pois é usada em varias funções

int main(int argc, char *argv[])
{
    int Xvalue = 100; //controla a posição da linha DIREITA
    int Yvalue = 500; //controla a posição da linha SUPERIOR
    int Zvalue = 200; //controla a posição da linha ESQUERDA
    int Wvalue = 600; //controla a posição da linha INFERIOR

    //para permitir movimento

    //Declaro a janela
    if (!al_init())
    {
        fprintf(stderr, "Falha ao inicializar a Allegro 5\n");
        return -1;
    }

    window = al_create_display(800, 600);
    //dou um valor em pixels para  a janela

    if (!window)
    {
        fprintf(stderr, "Falha ao criar a janela\n");
        return -1;
    }

    if (!al_init_primitives_addon())
    {
        fprintf(stderr, "Falha ao criar inicializar sistemas de primitivas\n");
        return -1;
    }

    al_clear_to_color(al_map_rgb(255, 255, 255));
    //Pinta a tela toda de alguma cor
    al_flip_display();
    //Mudando de matriz
    al_clear_to_color(al_map_rgb(255, 255, 255));
    //Pintando a secundária de branco também

    al_install_keyboard();
    //inicializa o teclado nesse escopo
    ALLEGRO_KEYBOARD_STATE keyState;

    al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(0, 0, 0));
    //preto

    al_flip_display(); //troca a matriz secundária pela primária
    //Assim mudado o que aparece na tela (secundária desenha, primária se vê)

    for (int imparPar = 0;; imparPar++)
    { //loop infinito

        al_rest(0.03);
        //Pra ninguém ter epilepsia

        al_get_keyboard_state(&keyState);
        //pega qualquer entrada pelo keyboard

        if (al_key_down(&keyState, ALLEGRO_KEY_ESCAPE))
            break;

        if (al_key_down(&keyState, ALLEGRO_KEY_A))
        {
            clear(Xvalue, Yvalue, Zvalue, Wvalue);

            Xvalue -= 10;
            Zvalue -= 10;
            //alterando as coordenadas para a esquerda

            al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(0, 0, 0));
            al_flip_display();
        }
        if (al_key_down(&keyState, ALLEGRO_KEY_D))
        {
            clear(Xvalue, Yvalue, Zvalue, Wvalue);

            Xvalue += 10;
            Zvalue += 10;
            //alterando as coordenadas para a direita

            al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(0, 0, 0));
            al_flip_display();
        }
        if (al_key_down(&keyState, ALLEGRO_KEY_W))
        {
            clear(Xvalue, Yvalue, Zvalue, Wvalue);

            Yvalue -= 10;
            Wvalue -= 10;

            al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(0, 0, 0));
            al_flip_display();
        }
        if (al_key_down(&keyState, ALLEGRO_KEY_S))
        {
            clear(Xvalue, Yvalue, Zvalue, Wvalue);

            Yvalue += 10;
            Wvalue += 10;

            al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(0, 0, 0));
            al_flip_display();
        }

        imparPar--;
        //pro imparPar nunca extrapolar a memória
    }

    finalizar();
}

int inicializar()
{
    if (!al_init())
        return 0;
    if (!al_install_keyboard())
        return 0;

    return 1;
}

int finalizar()
{
    al_uninstall_keyboard();
    //Para de esperar entrada

    al_destroy_display(window);
    //fecha o programa
    return 0;
}

void clear(int Xvalue, int Yvalue, int Zvalue, int Wvalue)
{

    al_draw_filled_rectangle(Xvalue, Yvalue, Zvalue, Wvalue, al_map_rgb(255, 255, 255));
    //Deixando o quadrado branco, para parecer que ele saiu do lugar
}
