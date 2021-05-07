package concretes;

import Entities.Game;
import abstracts.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " Isýmli Oyun Eklendi");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " Isýmli Oyun Güncellendi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " Isýmli Oyun Silindi.");
	}
}
