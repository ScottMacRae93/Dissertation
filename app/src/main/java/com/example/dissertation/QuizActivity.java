package com.example.dissertation;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button answer_a, answer_b, answer_c, answer_d;
    Button submit_button;

    int score = 0;
    int totalQuestion = QuestionAnswersActivity.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        totalQuestionsTextView = findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        answer_a = findViewById(R.id.answer_a);
        answer_b = findViewById(R.id.answer_b);
        answer_c = findViewById(R.id.answer_c);
        answer_d = findViewById(R.id.answer_d);
        submit_button = findViewById(R.id.submit_button);

        answer_a.setOnClickListener(this);
        answer_b.setOnClickListener(this);
        answer_c.setOnClickListener(this);
        answer_d.setOnClickListener(this);
        submit_button.setOnClickListener(this);

        totalQuestionsTextView.setText("Total Questions: " + totalQuestion);
    }

    // Set Answer Colour
    @Override
    public void onClick(View view) {
        answer_a.setBackgroundColor(Color.TRANSPARENT);
        answer_b.setBackgroundColor(Color.TRANSPARENT);
        answer_c.setBackgroundColor(Color.TRANSPARENT);
        answer_d.setBackgroundColor(Color.TRANSPARENT);

        Button clickedButton = (Button) view;
        if (clickedButton.getId() == R.id.submit_button) {
            if (selectedAnswer.equals(QuestionAnswersActivity.correctAnswers[currentQuestionIndex])) {
                score++;
            }
            currentQuestionIndex++;
            loadNewQuestion();

        } else {
            // Choices Button Clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);
        }
    }

    // New Question
    void loadNewQuestion() {

        if (currentQuestionIndex == totalQuestion) {
            finishQuiz();
            return;
        }
        questionTextView.setText(QuestionAnswersActivity.question[currentQuestionIndex]);
        answer_a.setText(QuestionAnswersActivity.answers[currentQuestionIndex][0]);
        answer_b.setText(QuestionAnswersActivity.answers[currentQuestionIndex][1]);
        answer_c.setText(QuestionAnswersActivity.answers[currentQuestionIndex][2]);
        answer_d.setText(QuestionAnswersActivity.answers[currentQuestionIndex][3]);
    }

    // Quiz Finished
    void finishQuiz() {
        String passStatus = "";
        if (score > totalQuestion * 0.60) {
            passStatus = "Passed. Let's get cooking!";
        } else {
            passStatus = "Failed. Unlucky! Maybe try some more revision before you get cooking! ";
        }

        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is " + score + " out of" + totalQuestion)
                .setPositiveButton("Restart", ((dialogInterface, i) -> restartQuiz()))
                .setCancelable(false)
                .show();
    }

    // Restart Quiz
    void restartQuiz() {
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
  }
