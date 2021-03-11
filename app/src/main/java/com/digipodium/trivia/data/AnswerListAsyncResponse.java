package com.digipodium.trivia.data;

import com.digipodium.trivia.module.Question;

import java.util.ArrayList;

public interface AnswerListAsyncResponse {

    void processFinished(ArrayList<Question> questionArrayList);



}
