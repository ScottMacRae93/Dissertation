package com.example.dissertation;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionAnswersActivity extends AppCompatActivity {

    public static String question[] = {
            "When dicing an onion, which object do you cut towards?",
            "What is the ideal time for blanching?",
            "When sautéing, when do you add food into the pan?",
            "What is tempering?",
            "What is a bolster with relation to knifes?"
    };

    public static String answers[][] = {
            {"The Fridge", "The Root", "Your Hand", "The Stem"},
            {"5 mins", "10 mins", "15 mins", "20 mins"},
            {"After 5 minutes of waiting", "When the oil begins to shimmer", "Straight away before adding oil", "After the oil begins to smoke"},
            {"Bringing food to room temp prior to cooking", "Getting angry", "Cooking food in a small shallow pool of oil", "Cooking food at a very high heat for a short period of time"},
            {"The 'pointy' end of the blade", "The bottom of the handle", "A small case in which knife's are held", "The thick junciton between the knife handle and blade"}
    };

    public static String correctAnswers[] = {
            "The Root",
            "5 mins",
            "When the oil begins to shimmer",
            "Bringing food to room temp prior to cooking",
            "The thick junciton between the knife handle and blade"
    };
}

