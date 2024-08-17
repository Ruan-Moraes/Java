package edu.nelioalves.curso.exercicios.excs12.exc1.exceptions;

public class AccountExpection extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AccountExpection(String msg) {
        super(msg);
    }
}
