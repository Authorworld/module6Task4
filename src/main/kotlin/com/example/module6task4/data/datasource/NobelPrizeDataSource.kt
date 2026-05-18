package com.example.module6task4.data.datasource

import com.example.module6task4.domain.model.Laureate
import com.example.module6task4.domain.model.NobelPrize

object NobelPrizeDataSource {

    val prizes: List<NobelPrize> = listOf(

        // ── 2023 ──────────────────────────────────────────────
        NobelPrize(
            year = 2023, category = "physics",
            laureates = listOf(
                Laureate("1017", "Pierre Agostini",
                    "for experimental methods that generate attosecond pulses of light", 3,
                    "USA", "1941-07-23"),
                Laureate("1018", "Ferenc Krausz",
                    "for experimental methods that generate attosecond pulses of light", 3,
                    "Hungary", "1962-05-17"),
                Laureate("1019", "Anne L'Huillier",
                    "for experimental methods that generate attosecond pulses of light", 3,
                    "France", "1958-08-16")
            )
        ),
        NobelPrize(
            year = 2023, category = "chemistry",
            laureates = listOf(
                Laureate("1020", "Moungi G. Bawendi",
                    "for the discovery and synthesis of quantum dots", 3,
                    "Tunisia", "1961-03-15"),
                Laureate("1021", "Louis E. Brus",
                    "for the discovery and synthesis of quantum dots", 3,
                    "USA", "1943-08-10"),
                Laureate("1022", "Alexei I. Ekimov",
                    "for the discovery and synthesis of quantum dots", 3,
                    "Russia", "1945-02-28")
            )
        ),
        NobelPrize(
            year = 2023, category = "medicine",
            laureates = listOf(
                Laureate("1023", "Katalin Karikó",
                    "for discoveries enabling development of effective mRNA vaccines", 2,
                    "Hungary", "1955-01-17"),
                Laureate("1024", "Drew Weissman",
                    "for discoveries enabling development of effective mRNA vaccines", 2,
                    "USA", "1959-09-07")
            )
        ),
        NobelPrize(
            year = 2023, category = "literature",
            laureates = listOf(
                Laureate("1025", "Jon Fosse",
                    "for his innovative plays and prose which give voice to the unsayable", 1,
                    "Norway", "1959-09-29")
            )
        ),
        NobelPrize(
            year = 2023, category = "peace",
            laureates = listOf(
                Laureate("1026", "Narges Mohammadi",
                    "for her fight against the oppression of women in Iran", 1,
                    "Iran", "1972-04-21")
            )
        ),
        NobelPrize(
            year = 2023, category = "economics",
            laureates = listOf(
                Laureate("1027", "Claudia Goldin",
                    "for advancing our understanding of women's labour market outcomes", 1,
                    "USA", "1946-05-14")
            )
        ),

        // ── 2022 ──────────────────────────────────────────────
        NobelPrize(
            year = 2022, category = "physics",
            laureates = listOf(
                Laureate("1008", "Alain Aspect",
                    "for experiments with entangled photons, establishing the violation of Bell inequalities", 3,
                    "France", "1947-06-15"),
                Laureate("1009", "John F. Clauser",
                    "for experiments with entangled photons, establishing the violation of Bell inequalities", 3,
                    "USA", "1942-12-01"),
                Laureate("1010", "Anton Zeilinger",
                    "for experiments with entangled photons, establishing the violation of Bell inequalities", 3,
                    "Austria", "1945-05-20")
            )
        ),
        NobelPrize(
            year = 2022, category = "chemistry",
            laureates = listOf(
                Laureate("1011", "Carolyn R. Bertozzi",
                    "for the development of click chemistry and bioorthogonal chemistry", 3,
                    "USA", "1966-10-10"),
                Laureate("1012", "Morten Meldal",
                    "for the development of click chemistry and bioorthogonal chemistry", 3,
                    "Denmark", "1954-01-16"),
                Laureate("1013", "K. Barry Sharpless",
                    "for the development of click chemistry and bioorthogonal chemistry", 3,
                    "USA", "1941-04-28")
            )
        ),
        NobelPrize(
            year = 2022, category = "peace",
            laureates = listOf(
                Laureate("1014", "Ales Bialiatski",
                    "for the fight for human rights and democracy", 3,
                    "Belarus", "1962-09-25"),
                Laureate("1015", "Memorial (organization)",
                    "for the fight for human rights and democracy", 3,
                    "Russia", null),
                Laureate("1016", "Center for Civil Liberties",
                    "for the fight for human rights and democracy", 3,
                    "Ukraine", null)
            )
        ),

        // ── 2021 ──────────────────────────────────────────────
        NobelPrize(
            year = 2021, category = "physics",
            laureates = listOf(
                Laureate("1001", "Syukuro Manabe",
                    "for the physical modelling of Earth's climate", 3,
                    "Japan", "1931-09-21"),
                Laureate("1002", "Klaus Hasselmann",
                    "for the physical modelling of Earth's climate", 3,
                    "Germany", "1931-10-25"),
                Laureate("1003", "Giorgio Parisi",
                    "for the discovery of the interplay of disorder and fluctuations in physical systems", 3,
                    "Italy", "1948-08-04")
            )
        ),
        NobelPrize(
            year = 2021, category = "chemistry",
            laureates = listOf(
                Laureate("1004", "Benjamin List",
                    "for the development of asymmetric organocatalysis", 2,
                    "Germany", "1968-01-11"),
                Laureate("1005", "David W.C. MacMillan",
                    "for the development of asymmetric organocatalysis", 2,
                    "UK", "1968-03-16")
            )
        ),
        NobelPrize(
            year = 2021, category = "medicine",
            laureates = listOf(
                Laureate("1006", "David Julius",
                    "for discoveries of receptors for temperature and touch", 2,
                    "USA", "1955-11-04"),
                Laureate("1007", "Ardem Patapoutian",
                    "for discoveries of receptors for temperature and touch", 2,
                    "Lebanon", "1967-10-02")
            )
        ),
        NobelPrize(
            year = 2021, category = "literature",
            laureates = listOf(
                Laureate("1028", "Abdulrazak Gurnah",
                    "for his uncompromising and compassionate penetration of the effects of colonialism", 1,
                    "Tanzania", "1948-12-20")
            )
        ),
        NobelPrize(
            year = 2021, category = "peace",
            laureates = listOf(
                Laureate("1029", "Maria Ressa",
                    "for efforts to safeguard freedom of expression", 2,
                    "Philippines", "1963-10-02"),
                Laureate("1030", "Dmitry Muratov",
                    "for efforts to safeguard freedom of expression", 2,
                    "Russia", "1961-10-30")
            )
        ),
        NobelPrize(
            year = 2021, category = "economics",
            laureates = listOf(
                Laureate("1031", "David Card",
                    "for empirical contributions to labour economics", 2,
                    "Canada", "1956-04-17"),
                Laureate("1032", "Joshua D. Angrist",
                    "for methodological contributions to the analysis of causal relationships", 4,
                    "USA", "1960-09-18"),
                Laureate("1033", "Guido W. Imbens",
                    "for methodological contributions to the analysis of causal relationships", 4,
                    "Netherlands", "1963-09-03")
            )
        ),

        // ── 2020 ──────────────────────────────────────────────
        NobelPrize(
            year = 2020, category = "physics",
            laureates = listOf(
                Laureate("900", "Roger Penrose",
                    "for the discovery that black hole formation is a robust prediction of the general theory of relativity", 2,
                    "UK", "1931-08-08"),
                Laureate("901", "Reinhard Genzel",
                    "for the discovery of a supermassive compact object at the centre of our galaxy", 4,
                    "Germany", "1952-03-24"),
                Laureate("902", "Andrea Ghez",
                    "for the discovery of a supermassive compact object at the centre of our galaxy", 4,
                    "USA", "1965-06-16")
            )
        ),
        NobelPrize(
            year = 2020, category = "chemistry",
            laureates = listOf(
                Laureate("903", "Emmanuelle Charpentier",
                    "for the development of a method for genome editing", 2,
                    "France", "1968-12-11"),
                Laureate("904", "Jennifer A. Doudna",
                    "for the development of a method for genome editing", 2,
                    "USA", "1964-02-19")
            )
        ),
        NobelPrize(
            year = 2020, category = "peace",
            laureates = listOf(
                Laureate("905", "World Food Programme",
                    "for its efforts to combat hunger and its contribution to bettering conditions for peace", 1,
                    null, null)
            )
        ),
        NobelPrize(
            year = 2020, category = "literature",
            laureates = listOf(
                Laureate("906", "Louise Glück",
                    "for her unmistakable poetic voice that with austere beauty makes individual existence universal", 1,
                    "USA", "1943-04-22")
            )
        ),
        NobelPrize(
            year = 2020, category = "economics",
            laureates = listOf(
                Laureate("907", "Paul R. Milgrom",
                    "for improvements to auction theory and inventions of new auction formats", 2,
                    "USA", "1948-04-20"),
                Laureate("908", "Robert B. Wilson",
                    "for improvements to auction theory and inventions of new auction formats", 2,
                    "USA", "1937-05-16")
            )
        )
    )
}