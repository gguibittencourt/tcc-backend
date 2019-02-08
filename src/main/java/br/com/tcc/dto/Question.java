package br.com.tcc.dto;

import java.util.Objects;

public class Question {

    private String idQuestion;
    private String idProcess;
    private String name;
    private String tip;

    public String getIdQuestion() {
        return idQuestion;
    }

    public Question setIdQuestion(String idQuestion) {
        this.idQuestion = idQuestion;
        return this;
    }

    public String getIdProcess() {
        return idProcess;
    }

    public Question setIdProcess(String idProcess) {
        this.idProcess = idProcess;
        return this;
    }

    public String getName() {
        return name;
    }

    public Question setName(String name) {
        this.name = name;
        return this;
    }

    public String getTip() {
        return tip;
    }

    public Question setTip(String tip) {
        this.tip = tip;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Question)) return false;
        Question question = (Question) o;
        return Objects.equals(getIdQuestion(), question.getIdQuestion()) &&
                Objects.equals(getIdProcess(), question.getIdProcess()) &&
                Objects.equals(getName(), question.getName()) &&
                Objects.equals(getTip(), question.getTip());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getIdQuestion(), getIdProcess(), getName(), getTip());
    }
}