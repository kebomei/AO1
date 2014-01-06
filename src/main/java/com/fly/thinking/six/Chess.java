package com.fly.thinking.six;

public class Chess extends BoardGame{

	public Chess(int i) {
		super(i);
		System.out.println("Chess Constructor");
	}

	public static void main(String[] args){
		
		Chess c = new Chess(11);
	}
}


class Game{
	
	public Game(int i){
		System.out.println("Game("+ i + ") consturctor");
	}
}

class BoardGame extends Game{

	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
	
	
}
