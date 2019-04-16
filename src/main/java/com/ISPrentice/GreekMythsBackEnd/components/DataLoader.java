package com.ISPrentice.GreekMythsBackEnd.components;

import com.ISPrentice.GreekMythsBackEnd.models.*;
import com.ISPrentice.GreekMythsBackEnd.repository.gods.GodRepository;
import com.ISPrentice.GreekMythsBackEnd.repository.heroes.HeroRepository;
import com.ISPrentice.GreekMythsBackEnd.repository.monsters.MonsterRepository;
import com.ISPrentice.GreekMythsBackEnd.repository.mortals.MortalRepository;
import com.ISPrentice.GreekMythsBackEnd.repository.myths.MythRepository;
import com.ISPrentice.GreekMythsBackEnd.repository.titans.TitanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    GodRepository godRepository;

    @Autowired
    HeroRepository heroRepository;

    @Autowired
    MonsterRepository monsterRepository;

    @Autowired
    MortalRepository mortalRepository;

    @Autowired
    MythRepository mythRepository;

    @Autowired
    TitanRepository titanRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args){
        God zeus = new God("Zeus", "Sky Father", "Sky and the Havens", "Zeus is Allfather of the Gods and the head of the Greek pantheo.", "Zeus is the King of the gods, the sky father and he Lord of Olympus. His father was the Titan Cronus and his mother was the Titan Rhea. He is married to Hera and father to Hephaestus, Ares, Apollo, Artemis, Athena, Hermes and Dionysus. There are many tales of Zeus's exploits, such as him defeating the Titans, his rise to the Allfather of the gods. But he is best known for all the times he was unfaithful to Hera with mortals and immortals alike");

        godRepository.save(zeus);

        God hera = new God("Hera", "Queen of Heaven", "Marriage, Mothers and Families", "Hera is the Queen of the gods and heaven","Hera is mother to the Gods and Queen of Heaven. Her father was the Titan Cronus and her mother was the Titan Rhea. Her children included Hephaestus, Ares and Eileithyia. Hera has responsibility over Marriage, Mothers and Families. So it is rather ironic that she is married to Zeus. He is constantly cheating on her with Mortals and Immortals alike, such as the titan Leto which lead to the birth of Artemis and Apollo. As a result Hera is pron to fits of rage and jealousy at her husbands actions. She also seeks revenge on the people who she fells have wronged her, like in the case of Heracles.");

        godRepository.save(hera);

        God aphrodite = new God("Aphrodite", "Goddess of Love","beauty, love, desire, and pleasure", "Aphrodite the Goddess of love, beauty and desire", "Aphrodite is the Goddess of love, beauty, desire and pleasure. She was born from the sea-foam from Uranus severed genitals. She is married to Hephaestus, but constantly cheats on him this other gods and mortals like Ares and Adonis. She is constantly causing problems for mortals, getting revenge on anyone that is says they are more beautiful than here or just causes problems on a whim.");

        godRepository.save(aphrodite);



        Titan helios = new Titan("Helios", "Titan of the Sun", "Helios is the Titan of the Sun.", "Helios is of the Titan race. His father was Hyperion and his mother was Thia. He was originally the Titan tha opened the sun door for Apollos sun chariot. But after the death of Phaethon Apollos mortal son, he retired from driving the sun chariot and haded the rains over to Helios. The word helium is name after him.");

        titanRepository.save(helios);



        Hero heracles = new Hero("Heracles", "A son of Zeus and one of great greek hero's", "Heracles is one of the greatest hero's in greek mythology. He is the son Zeus and Alcmene. He was raised by his mortal parents along with his twin brother (who is not fathered by Zeus but Alcmene real husband Amphitryon). As he was an illegitimate son of Zeus this of course incurred the wrath of Hera. She did everything in her power to ruin Heracles life. She made him kill his family in a fit rage, had him complete 10 Labours and many others. Despite this he still over came all trials and became a great hero.");

        heroRepository.save(heracles);

        Hero jason = new Hero("Jason", "Jason is best known for his adventures on the Argonaut", "Jason is the son of the mortal king Aeson of Lolcos and Alcimede. Most of his heroic exploits happened when he he took his ship the Argonaut to look for the golden fleas. On this voyage he had in his crew such people as Heracles, Orpheus and Atalanta in some sources. On this voyage he tackled such foes as the Harpies, Sirens and Talos. He would also meet his first wife Medea on this adventure.");

        heroRepository.save(jason);



        Mortal phaethon = new Mortal("Phaethon", "He is a son of Apollo", "Phaethon is a son of Apollo or Helios(sources vary). He is now for his myth in involving the sun chariot and nearly burning the world. Along with Icarus he is know for getting to close to the sun and got burned.");

        mortalRepository.save(phaethon);

        Mortal medea = new Mortal("Medea", "Medea is the daughter of king Aeëtes and a sorceresses","Medea is the daughter of Aeëtes the king of Colchis. She is also the niece of Circe and like her aunt she is a sorceress. As such she worships the goddess Hecate. When Jason and the argonauts arrived at Colchis she was as hostile as father to their presence. But Aphrodite who was offend by Medea's refusal of romantic love, cast a love spell on her to make her fall in love with Jason. Once this spell was cast she would do anything for her new love even kill her own family if needed.");

        mortalRepository.save(medea);



        Monster siren = new Monster("Siren", "Sirens often lure sailors to a water grave", "Sirens are creature to use their ethereal voice to lure sailors to smash their ships on the rocks. The are normally shown to have a female head and body but the wing and legs of a bird. The show up in a few myth involving sailors who venture to close to there rocky shores.");

        monsterRepository.save(siren);

        Monster cerberus = new Monster("Cerberus", "The guard dog of the Underworld", "Cerberus is the three headed guard dog of the Underworld. He is son of Typhon and Echidna the mother of monsters. He was later taken in by Hades to guard the underworld from intruders. But he has let some people through in the bas such as Orpheus when he went to the under world to retrieve his dead wife.");

        monsterRepository.save(cerberus);



        Myth jasonAndSirens = new Myth("Jason and the Sirens", "This is the tale of when Jason and his crew came across the Sirens", "This tale is from when Jason went on a quest for the golden fleece. Jason and his argonauts where on the way back from Colchis with the golden fleece and where being chased by Aeëtes the king of Colchis. This was because they had stole the golden fleece. His daughter Medea had fallen in love with Jason so join the argonauts and killed killed her brother as they fled. Since they were on the run they had to take a shortcut close to the sirens island. This was dangerous since the call of the sirens would lure all men to their demise and the argonauts were all men except for Medea. But they had Orpheus there ships musician, he was one of the best musicians in greek myth. They use his music to drown out the sirens music and passed by the island unaffected my the sirens call.");

        mythRepository.save(jasonAndSirens);



        jasonAndSirens.addHumans(jason);
        jasonAndSirens.addMonster(siren);
        jasonAndSirens.addHumans(medea);

        mythRepository.save(jasonAndSirens);


    }
}
