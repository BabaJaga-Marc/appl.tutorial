package appl.tutorial.school;

import java.util.List;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

public class SchoolFactory {

	public static void main(String[] args) {
		School whg = new School("WHG");

		String[] letters = { "A", "B", "C", "D" };
		int[] years = { 5, 6, 7, 8, 9, 10, 11, 12 };
		for (int year : years) {
			for (String letter : letters) {
				whg.addSchoolclass(year, letter);
			}
		}

		String names = "Anna Gramm__Anne Fresse__Anne Kehle__Anne Wandnageln__Anne Futrubbeln__Anette Halbestunde__Al Coholic__Abuzer Korkusuz__Albert Gern-Rumm__Ali Gator__Ali Mente__Ali Anz__Amy Nem__Andi Arbeit__Andi Brust__Andi Eier__Andi Fresse-Kriegen__Andi Front__Andi Macht__Andi Waffen__Andi Wand__Andi Wäsche__Andi Bar__Andi Christ__Andi Theke__Andrees Schnabel__Anna Konda__Anna Bolika__Anna L.__Anna Nass__Anna Koluth__Anna Pest__Anna Lyse__Anna Log__Anna Machslochoff__Anna Pher__Anne Theke__Anne Wandnageln__Anna Krohn-Ismus__Ann Alphabet__Anne Wand-Fahren__Annie Won__Arno Nühm__Axel Haar__Axel Schweiß__Axel Zucken__Axel Kratzen__Bastian Kolbenrein__Bela Stung__Behindi__Ben Ebelt__Ben Zien__Ben Z.__Ben Ehmen__Ben Utzmich__Bernhard Diener__Bill Da Ramen__Bill Dung__Bill Dschirmschoner__Bill Derbuch__Bill Lich__Bill Ichnaps__Bin Einkaufen__Bin Arbeiten__Bin Beschäftigt__Bin Dfaden__Bin Demittel__Bin Laden__Bin Mülleimer__Bin Gay__Brad R. Zaun__Bruce Twarze__Bill Iard__Bruce Timplantat__B.Umsen__Carmen Bert__Claire Grube__Claire Werk__Claire-Ann Lage__Chris P. Bacon__Chris P. Schiggen__Chris Baum__Chris T. Allkugel__Christel Mett__Clara Mellapfel__Christian Harten__Christian Dicken__Christian Steifen__Christiane Krise__Christiane Schmidt__Christiane Latte__Christoph Smaul__Clara Vorteil__Claude Eckel__Cole Rabi__Eddie Kett__Efie Zient__Einar Gädnoch__Elke Pone__Eugen Trautz__Erd B. Ben__Ernst Bleiben__Ernst Haft__Ero Giert__Ero Tisch__Eva Ngelium__Eja Kulat__Ego(n) Ist__Eric Astrauss__Erik Zion__Erhard Pech__Erhard N. Kleinen__Erkan Doitsch__Erkan Hartwigsen__Ellen Bogen__Fidi Ralla__Finn Land__Flexi Hartmann__Florian Silbereisen__Flo Rida__Frank N. Stein__Frank N. Wein__Frank Furt__Frank Reich__Franz Brandwein__Franz Hose__Franz Iskaner__Franziska Ner__Florian Van Klug__Franz Van Schwanz__Franz Ose__Frank Apotente__F.Otze__Frank Patrick__F. Icken__Frau Mitten-Entzwei__Frauke Petry__Frau Kepetry__Freya Fick__Hansi G. Burtstag__Haudehn, Lukas__Heide Witzka__Harald „Haldi“ Gosch__Harry Cane__Harry Gersack__Harry G. Angelegenheit__Harry Ballds__Harry Bo__H. R. Schneider__Halo Zina Zion__Ida Oberstein__Ina Larm__Ina Lieren__Isolde Voegele__Isolde Baden__Isolde Hartwigsen__Isolde Maduschen__Izmir Egal__Izmir Lang Weilig__Izmir Übül__Izmir Wayne__Izmir Wurscht__Iris Gleichen__Ismael Iieber__Ichkackmir IndieHos__Ivan Gehstdudruff__Jana Dann__Jana Klar__Jana Türlich__Jean Drinn__Jean Tod__Jenny Tal__Joe Kolade__Jo Ghurt__Johannes Beer__Johannes Burg__Johannes Kraut__Jim Panse__Julia Mazonas__Justin Time__John Gleur__Kai Ahnung__Kai Geld__Kai Serschmarn__Kai Panik__Kane Ahnung__Kain Leben__Kain Mutter__Kain Schwain__Kain Alibi__Karsten Bier__Kater Lysator__Katha Strofe__Karl Auer__Karl Kopf__Karl Laschnikov__Karl Nickel__Karl Rasur__Karl Zone__Kettenka Russel__Lars Crachen__Lars Tragl__Lou Latsch__Lou Ziffer__Lee Metten__Lee Mone__Leo Pard__Lexi Hartmann__Li Be__Langer Hans__Lanze Lott__Lasse Samenström__Las Miranda Den Sivilla__Lars Vegas__Leo Lamar-Schadler__Mahatma Glück__Mahatma Pech__Mand Allah__Manni Toba__Marco Rahlsächs__Markus Birholn__Maria Kron__Mario Hanna__Mary Huana__Mary Joana__Mario Nette__Markus Van Hinten__Max Mustermann__Max Imal__Max Hartmann__Mehdi A. Markt__Mehdi Zin__Meinhart Esrohr__Maik Rosoft__Mike Litoris__Mira Bellenbaum__Miss Erabel__Miss Erfolg__Miss Geburt__Miss Lungen__Miss Rathen__Mark Aber__Melitta Mann__Maria Zell__Mark Brandenburg__Micha Tronika__Michi Gan__Mike Kaefer__Paul Lahner__Peer Sil__Peer Arschmussen__Peer Cing__Peter File__Peter Silie__Petty Küre__Peter Gogisch (jug.)__Peter Lustich__Peter Rast__Peter Silie__Peer Anhalter__Peer Plex__Peer Vers__Peer Zufall__Peter Van Arschbacke__Reiner Lös__Resi Denz__Resi Gnation__Rita Lien__Roman Schreiber__Roman Tisch__Rainer Wahnsinn__Rosa Schluepfer__Röchelbehns__Sven Samenstrøm__Rainer Hohn__Rudi Mentär__Rudi Mente__Ros Marin__Rosen Kohl__Roy Makaay__Ryan Luntzen__Theo Retisch__Thor Wart__Tim Buktu__Tim Balunga__Tom Ate__Tom Bola__Timo Beil__Tom Ahak__Tom Kha Gai__Torge Fährlich__Victor Heil__Vig van Hinnten__Vince Ling__Volker Oht__Volker Racho__Volker Putt__Vera Bschiedung__Vicky Pedia__Vig Mich__Vita Lität__Vera Saut__Vera Rschen__Vera A.M. Mittag__Vance Shepperd__Walter Schwede__Walter Pepeka__Watt, Sepp__Wendy Lator__Wayne Interessierts__Wayne Juckz__Wilma Jucken__Wilma Poppen__Wilma Bumsen__Wilma B. Samen__Wilma Eierkraulen__Will Malecken__Willhelm Haben__Will Dsau__Will P. Nisselecken__William Van Hindenei__Wilma Van Hindenei__Willma-Jehmand van Hinten-Nehmen__Willi Net-Ham__Winni Peg__Wollta Senfdazu__Wolf Gang__Wayne Interessierts__Wilfried Lichwichsen__Zed Rick__Zelma Nach__Zack Clayton";
		String[] namesArray = StringUtils.split(names, "__");
		for (String name : namesArray) {
			whg.addPupil(name, RandomUtils.nextInt(11, 19));
		}

		List<Schoolclass> schoolclasses = whg.getSchoolclasses();
		for (Schoolclass schoolclass : schoolclasses) {
			System.out.println(schoolclass.getClassname());
			List<Pupil> pupils = schoolclass.getPupils();
			for (Pupil pupil : pupils) {
				// System.out.println(" - " + pupil.getName() + ", " + pupil.getAge());
			}
		}

		Schoolclass class10B = whg.getSchoolclass("10B");
		List<Pupil> pupils = class10B.getPupils();
		for (Pupil pupil : pupils) {
			System.out.println(" - " + pupil.getName() + ", " + pupil.getAge());
		}
	}

}
