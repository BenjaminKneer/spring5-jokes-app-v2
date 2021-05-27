package guru.springframework.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisInfoContributor;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeGeneratorServiceImpl implements JokeGeneratorService {

    @Override
    public String generateJoke() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

        return chuckNorrisQuotes.getRandomQuote();
    }
}
