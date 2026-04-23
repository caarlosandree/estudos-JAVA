package com.streamingmovie.services;

import com.streamingmovie.models.Serie;
import com.streamingmovie.models.Episodio;

public class CriarEpisodios {
    public static Episodio[] episodios() {
        Serie[] series = CriarSeries.series().toArray(new Serie[0]);
        Serie theBoys = series[0];
        Serie breakingBad = series[1];
        Serie lost = series[2];

        Episodio[] episodiosTheBoys = new Episodio[30];
        Episodio[] episodiosBreakingBad = new Episodio[50];
        Episodio[] episodiosLost = new Episodio[120];

        // The Boys - 3 temporadas, 10 episódios cada
        episodiosTheBoys[0] = criarEpisodio(1, "The Name of the Game", 60, 8.5, theBoys);
        episodiosTheBoys[1] = criarEpisodio(2, "Cherry", 58, 8.2, theBoys);
        episodiosTheBoys[2] = criarEpisodio(3, "Get Some", 55, 8.0, theBoys);
        episodiosTheBoys[3] = criarEpisodio(4, "The Innocents", 57, 8.3, theBoys);
        episodiosTheBoys[4] = criarEpisodio(5, "Good for the Soul", 59, 8.1, theBoys);
        episodiosTheBoys[5] = criarEpisodio(6, "The Big Ride", 56, 8.4, theBoys);
        episodiosTheBoys[6] = criarEpisodio(7, "Over the Hill with the Swords of a Thousand Men", 62, 8.6, theBoys);
        episodiosTheBoys[7] = criarEpisodio(8, "You Found Me", 58, 8.7, theBoys);
        episodiosTheBoys[8] = criarEpisodio(9, "The Big Ride", 57, 8.0, theBoys);
        episodiosTheBoys[9] = criarEpisodio(10, "Proper Preparation and Planning", 60, 8.3, theBoys);

        episodiosTheBoys[10] = criarEpisodio(11, "Nothing Like It", 55, 8.5, theBoys);
        episodiosTheBoys[11] = criarEpisodio(12, "We Gotta Go Now", 58, 8.2, theBoys);
        episodiosTheBoys[12] = criarEpisodio(13, "The Bloody Doors Off", 56, 8.4, theBoys);
        episodiosTheBoys[13] = criarEpisodio(14, "Butcher, Baker, Candlestickmaker", 61, 8.6, theBoys);
        episodiosTheBoys[14] = criarEpisodio(15, "What I Know", 59, 8.8, theBoys);
        episodiosTheBoys[15] = criarEpisodio(16, "The Big Ride", 57, 8.1, theBoys);
        episodiosTheBoys[16] = criarEpisodio(17, "Over the Hill with the Swords of a Thousand Men", 62, 8.5, theBoys);
        episodiosTheBoys[17] = criarEpisodio(18, "You Found Me", 58, 8.7, theBoys);
        episodiosTheBoys[18] = criarEpisodio(19, "The Big Ride", 56, 8.3, theBoys);
        episodiosTheBoys[19] = criarEpisodio(20, "Proper Preparation and Planning", 60, 8.4, theBoys);

        episodiosTheBoys[20] = criarEpisodio(21, "Payback", 60, 8.9, theBoys);
        episodiosTheBoys[21] = criarEpisodio(22, "The Only Man in the Sky", 58, 8.7, theBoys);
        episodiosTheBoys[22] = criarEpisodio(23, "Barbary Coast", 55, 8.4, theBoys);
        episodiosTheBoys[23] = criarEpisodio(24, "Glorious Five Year Plan", 57, 8.6, theBoys);
        episodiosTheBoys[24] = criarEpisodio(25, "The Last Time to Look on This World of Lies", 62, 8.8, theBoys);
        episodiosTheBoys[25] = criarEpisodio(26, "Herogasm", 59, 9.0, theBoys);
        episodiosTheBoys[26] = criarEpisodio(27, "Here Comes a Candle to Light You to Bed", 61, 8.9, theBoys);
        episodiosTheBoys[27] = criarEpisodio(28, "The Instant White-Hot Wild", 58, 9.1, theBoys);
        episodiosTheBoys[28] = criarEpisodio(29, "The Big Ride", 56, 8.5, theBoys);
        episodiosTheBoys[29] = criarEpisodio(30, "Over the Hill with the Swords of a Thousand Men", 63, 8.8, theBoys);

        // Breaking Bad - 5 temporadas, 10 episódios cada
        episodiosBreakingBad[0] = criarEpisodio(1, "Pilot", 48, 9.5, breakingBad);
        episodiosBreakingBad[1] = criarEpisodio(2, "Cat's in the Bag...", 48, 9.2, breakingBad);
        episodiosBreakingBad[2] = criarEpisodio(3, "...And the Bag's in the River", 48, 9.0, breakingBad);
        episodiosBreakingBad[3] = criarEpisodio(4, "Cancer Man", 48, 8.8, breakingBad);
        episodiosBreakingBad[4] = criarEpisodio(5, "Gray Matter", 48, 8.9, breakingBad);
        episodiosBreakingBad[5] = criarEpisodio(6, "Crazy Handful of Nothin'", 48, 9.1, breakingBad);
        episodiosBreakingBad[6] = criarEpisodio(7, "A No-Rough-Stuff-Type Deal", 48, 8.7, breakingBad);
        episodiosBreakingBad[7] = criarEpisodio(8, "Seven Thirty-Seven", 48, 9.3, breakingBad);
        episodiosBreakingBad[8] = criarEpisodio(9, "Down", 48, 8.9, breakingBad);
        episodiosBreakingBad[9] = criarEpisodio(10, "Over", 48, 9.4, breakingBad);

        // Temporada 2
        episodiosBreakingBad[10] = criarEpisodio(11, "Seven Thirty-Seven", 48, 9.3, breakingBad);
        episodiosBreakingBad[11] = criarEpisodio(12, "Grilled", 48, 9.4, breakingBad);
        episodiosBreakingBad[12] = criarEpisodio(13, "Bit by a Dead Bee", 48, 8.9, breakingBad);
        episodiosBreakingBad[13] = criarEpisodio(14, "Down", 48, 8.7, breakingBad);
        episodiosBreakingBad[14] = criarEpisodio(15, "Breakage", 48, 8.8, breakingBad);
        episodiosBreakingBad[15] = criarEpisodio(16, "Peekaboo", 48, 9.2, breakingBad);
        episodiosBreakingBad[16] = criarEpisodio(17, "Negro y Azul", 48, 8.9, breakingBad);
        episodiosBreakingBad[17] = criarEpisodio(18, "Better Call Saul", 48, 9.5, breakingBad);
        episodiosBreakingBad[18] = criarEpisodio(19, "4 Days Out", 48, 9.3, breakingBad);
        episodiosBreakingBad[19] = criarEpisodio(20, "Over", 48, 9.4, breakingBad);

        // Temporada 3
        episodiosBreakingBad[20] = criarEpisodio(21, "No Más", 48, 9.4, breakingBad);
        episodiosBreakingBad[21] = criarEpisodio(22, "Caballo Sin Nombre", 48, 9.0, breakingBad);
        episodiosBreakingBad[22] = criarEpisodio(23, "I.F.T.", 48, 9.1, breakingBad);
        episodiosBreakingBad[23] = criarEpisodio(24, "Green Light", 48, 8.8, breakingBad);
        episodiosBreakingBad[24] = criarEpisodio(25, "Más", 48, 9.3, breakingBad);
        episodiosBreakingBad[25] = criarEpisodio(26, "Sunset", 48, 9.2, breakingBad);
        episodiosBreakingBad[26] = criarEpisodio(27, "One Minute", 48, 9.6, breakingBad);
        episodiosBreakingBad[27] = criarEpisodio(28, "I See You", 48, 9.1, breakingBad);
        episodiosBreakingBad[28] = criarEpisodio(29, "Kafkaesque", 48, 8.9, breakingBad);
        episodiosBreakingBad[29] = criarEpisodio(30, "Fly", 48, 8.5, breakingBad);

        // Temporada 4
        episodiosBreakingBad[30] = criarEpisodio(31, "Box Cutter", 48, 9.5, breakingBad);
        episodiosBreakingBad[31] = criarEpisodio(32, "Thirty-Eight Snub", 48, 9.0, breakingBad);
        episodiosBreakingBad[32] = criarEpisodio(33, "Open House", 48, 8.4, breakingBad);
        episodiosBreakingBad[33] = criarEpisodio(34, "Bullet Points", 48, 8.8, breakingBad);
        episodiosBreakingBad[34] = criarEpisodio(35, "Shotgun", 48, 9.1, breakingBad);
        episodiosBreakingBad[35] = criarEpisodio(36, "Cornered", 48, 8.9, breakingBad);
        episodiosBreakingBad[36] = criarEpisodio(37, "Problem Dog", 48, 9.0, breakingBad);
        episodiosBreakingBad[37] = criarEpisodio(38, "Hermanos", 48, 9.3, breakingBad);
        episodiosBreakingBad[38] = criarEpisodio(39, "Bug", 48, 8.8, breakingBad);
        episodiosBreakingBad[39] = criarEpisodio(40, "Salud", 48, 9.4, breakingBad);

        // Temporada 5
        episodiosBreakingBad[40] = criarEpisodio(41, "Live Free or Die", 48, 9.3, breakingBad);
        episodiosBreakingBad[41] = criarEpisodio(42, "Madrigal", 48, 9.0, breakingBad);
        episodiosBreakingBad[42] = criarEpisodio(43, "Hazard Pay", 48, 8.9, breakingBad);
        episodiosBreakingBad[43] = criarEpisodio(44, "Fifty-One", 48, 9.1, breakingBad);
        episodiosBreakingBad[44] = criarEpisodio(45, "Dead Freight", 48, 9.2, breakingBad);
        episodiosBreakingBad[45] = criarEpisodio(46, "Buyout", 48, 9.0, breakingBad);
        episodiosBreakingBad[46] = criarEpisodio(47, "Say My Name", 48, 9.5, breakingBad);
        episodiosBreakingBad[47] = criarEpisodio(48, "Gliding Over All", 48, 9.1, breakingBad);
        episodiosBreakingBad[48] = criarEpisodio(49, "Blood Money", 48, 9.4, breakingBad);
        episodiosBreakingBad[49] = criarEpisodio(50, "Buried", 48, 9.2, breakingBad);

        // Lost - 6 temporadas
        // Temporada 1 - 24 episódios
        episodiosLost[0] = criarEpisodio(1, "Pilot: Part 1", 42, 9.0, lost);
        episodiosLost[1] = criarEpisodio(2, "Pilot: Part 2", 42, 9.1, lost);
        episodiosLost[2] = criarEpisodio(3, "Tabula Rasa", 42, 8.5, lost);
        episodiosLost[3] = criarEpisodio(4, "Walkabout", 42, 9.2, lost);
        episodiosLost[4] = criarEpisodio(5, "White Rabbit", 42, 8.7, lost);
        episodiosLost[5] = criarEpisodio(6, "House of the Rising Sun", 42, 8.4, lost);
        episodiosLost[6] = criarEpisodio(7, "The Moth", 42, 8.6, lost);
        episodiosLost[7] = criarEpisodio(8, "Confidence Man", 42, 8.3, lost);
        episodiosLost[8] = criarEpisodio(9, "Solitary", 42, 9.0, lost);
        episodiosLost[9] = criarEpisodio(10, "Raised by Another", 42, 8.5, lost);
        episodiosLost[10] = criarEpisodio(11, "All the Best Cowboys Have Daddy Issues", 42, 8.4, lost);
        episodiosLost[11] = criarEpisodio(12, "Whatever the Case May Be", 42, 8.6, lost);
        episodiosLost[12] = criarEpisodio(13, "Hearts and Minds", 42, 8.3, lost);
        episodiosLost[13] = criarEpisodio(14, "Special", 42, 8.7, lost);
        episodiosLost[14] = criarEpisodio(15, "Homecoming", 42, 8.5, lost);
        episodiosLost[15] = criarEpisodio(16, "Outlaws", 42, 8.8, lost);
        episodiosLost[16] = criarEpisodio(17, "...In Translation", 42, 8.4, lost);
        episodiosLost[17] = criarEpisodio(18, "Numbers", 42, 9.1, lost);
        episodiosLost[18] = criarEpisodio(19, "Deus Ex Machina", 42, 8.6, lost);
        episodiosLost[19] = criarEpisodio(20, "Do No Harm", 42, 9.0, lost);
        episodiosLost[20] = criarEpisodio(21, "The Greater Good", 42, 8.5, lost);
        episodiosLost[21] = criarEpisodio(22, "Born to Run", 42, 8.4, lost);
        episodiosLost[22] = criarEpisodio(23, "Exodus: Part 1", 42, 9.2, lost);
        episodiosLost[23] = criarEpisodio(24, "Exodus: Part 2", 42, 9.3, lost);

        // Temporada 2 - 24 episódios
        episodiosLost[24] = criarEpisodio(25, "Man of Science, Man of Faith", 42, 8.8, lost);
        episodiosLost[25] = criarEpisodio(26, "Adrift", 42, 8.5, lost);
        episodiosLost[26] = criarEpisodio(27, "Orientation", 42, 9.0, lost);
        episodiosLost[27] = criarEpisodio(28, "Everybody Hates Hugo", 42, 8.3, lost);
        episodiosLost[28] = criarEpisodio(29, "...And Found", 42, 8.6, lost);
        episodiosLost[29] = criarEpisodio(30, "Abandoned", 42, 8.4, lost);
        episodiosLost[30] = criarEpisodio(31, "The Other 48 Days", 42, 8.9, lost);
        episodiosLost[31] = criarEpisodio(32, "Collision", 42, 8.7, lost);
        episodiosLost[32] = criarEpisodio(33, "What Kate Did", 42, 8.5, lost);
        episodiosLost[33] = criarEpisodio(34, "The 23rd Psalm", 42, 8.8, lost);
        episodiosLost[34] = criarEpisodio(35, "The Hunting Party", 42, 8.4, lost);
        episodiosLost[35] = criarEpisodio(36, "Fire + Water", 42, 8.2, lost);
        episodiosLost[36] = criarEpisodio(37, "The Long Con", 42, 8.6, lost);
        episodiosLost[37] = criarEpisodio(38, "One of Them", 42, 8.7, lost);
        episodiosLost[38] = criarEpisodio(39, "Maternity Leave", 42, 8.3, lost);
        episodiosLost[39] = criarEpisodio(40, "The Whole Truth", 42, 8.5, lost);
        episodiosLost[40] = criarEpisodio(41, "Lockdown", 42, 8.8, lost);
        episodiosLost[41] = criarEpisodio(42, "Dave", 42, 8.4, lost);
        episodiosLost[42] = criarEpisodio(43, "S.O.S.", 42, 8.6, lost);
        episodiosLost[43] = criarEpisodio(44, "Two for the Road", 42, 9.1, lost);
        episodiosLost[44] = criarEpisodio(45, "?", 42, 8.9, lost);
        episodiosLost[45] = criarEpisodio(46, "Live Together, Die Alone: Part 1", 42, 9.2, lost);
        episodiosLost[46] = criarEpisodio(47, "Live Together, Die Alone: Part 2", 42, 9.3, lost);

        // Temporada 3 - 23 episódios
        episodiosLost[47] = criarEpisodio(48, "A Tale of Two Cities", 42, 8.7, lost);
        episodiosLost[48] = criarEpisodio(49, "The Glass Ballerina", 42, 8.4, lost);
        episodiosLost[49] = criarEpisodio(50, "Further Instructions", 42, 8.5, lost);
        episodiosLost[50] = criarEpisodio(51, "Every Man for Himself", 42, 8.6, lost);
        episodiosLost[51] = criarEpisodio(52, "The Cost of Living", 42, 8.8, lost);
        episodiosLost[52] = criarEpisodio(53, "I Do", 42, 9.0, lost);
        episodiosLost[53] = criarEpisodio(54, "Not in Portland", 42, 8.4, lost);
        episodiosLost[54] = criarEpisodio(55, "Flashes Before Your Eyes", 42, 8.9, lost);
        episodiosLost[55] = criarEpisodio(56, "Stranger in a Strange Land", 42, 8.2, lost);
        episodiosLost[56] = criarEpisodio(57, "Tricia Tanaka Is Dead", 42, 8.5, lost);
        episodiosLost[57] = criarEpisodio(58, "Enter 77", 42, 8.7, lost);
        episodiosLost[58] = criarEpisodio(59, "Par Avion", 42, 8.4, lost);
        episodiosLost[59] = criarEpisodio(60, "The Man from Tallahassee", 42, 8.8, lost);
        episodiosLost[60] = criarEpisodio(61, "Exposé", 42, 8.3, lost);
        episodiosLost[61] = criarEpisodio(62, "Left Behind", 42, 8.6, lost);
        episodiosLost[62] = criarEpisodio(63, "One of Us", 42, 8.5, lost);
        episodiosLost[63] = criarEpisodio(64, "Catch-22", 42, 8.7, lost);
        episodiosLost[64] = criarEpisodio(65, "D.O.C.", 42, 8.4, lost);
        episodiosLost[65] = criarEpisodio(66, "The Brig", 42, 8.9, lost);
        episodiosLost[66] = criarEpisodio(67, "The Man Behind the Curtain", 42, 9.0, lost);
        episodiosLost[67] = criarEpisodio(68, "Greatest Hits", 42, 9.2, lost);
        episodiosLost[68] = criarEpisodio(69, "Through the Looking Glass: Part 1", 42, 9.3, lost);
        episodiosLost[69] = criarEpisodio(70, "Through the Looking Glass: Part 2", 42, 9.4, lost);

        // Temporada 4 - 14 episódios
        episodiosLost[70] = criarEpisodio(71, "The Beginning of the End", 42, 8.8, lost);
        episodiosLost[71] = criarEpisodio(72, "Confirmed Dead", 42, 8.5, lost);
        episodiosLost[72] = criarEpisodio(73, "The Economist", 42, 8.6, lost);
        episodiosLost[73] = criarEpisodio(74, "Eggtown", 42, 8.4, lost);
        episodiosLost[74] = criarEpisodio(75, "The Constant", 42, 9.5, lost);
        episodiosLost[75] = criarEpisodio(76, "The Other Woman", 42, 8.3, lost);
        episodiosLost[76] = criarEpisodio(77, "Ji Yeon", 42, 8.7, lost);
        episodiosLost[77] = criarEpisodio(78, "Meet Kevin Johnson", 42, 8.5, lost);
        episodiosLost[78] = criarEpisodio(79, "The Shape of Things to Come", 42, 9.1, lost);
        episodiosLost[79] = criarEpisodio(80, "Something Nice Back Home", 42, 8.6, lost);
        episodiosLost[80] = criarEpisodio(81, "Cabin Fever", 42, 8.8, lost);
        episodiosLost[81] = criarEpisodio(82, "There's No Place Like Home: Part 1", 42, 8.9, lost);
        episodiosLost[82] = criarEpisodio(83, "There's No Place Like Home: Part 2", 42, 9.2, lost);
        episodiosLost[83] = criarEpisodio(84, "There's No Place Like Home: Part 3", 42, 9.3, lost);

        // Temporada 5 - 17 episódios
        episodiosLost[84] = criarEpisodio(85, "Because You Left", 42, 8.7, lost);
        episodiosLost[85] = criarEpisodio(86, "The Lie", 42, 8.5, lost);
        episodiosLost[86] = criarEpisodio(87, "Jughead", 42, 8.9, lost);
        episodiosLost[87] = criarEpisodio(88, "The Little Prince", 42, 8.4, lost);
        episodiosLost[88] = criarEpisodio(89, "This Place Is Death", 42, 8.8, lost);
        episodiosLost[89] = criarEpisodio(90, "316", 42, 9.0, lost);
        episodiosLost[90] = criarEpisodio(91, "The Life and Death of Jeremy Bentham", 42, 8.6, lost);
        episodiosLost[91] = criarEpisodio(92, "LaFleur", 42, 8.5, lost);
        episodiosLost[92] = criarEpisodio(93, "Namaste", 42, 8.7, lost);
        episodiosLost[93] = criarEpisodio(94, "He's Our You", 42, 8.4, lost);
        episodiosLost[94] = criarEpisodio(95, "Whatever Happened, Happened", 42, 9.1, lost);
        episodiosLost[95] = criarEpisodio(96, "Dead Is Dead", 42, 8.8, lost);
        episodiosLost[96] = criarEpisodio(97, "Some Like It Hoth", 42, 8.3, lost);
        episodiosLost[97] = criarEpisodio(98, "The Variable", 42, 8.6, lost);
        episodiosLost[98] = criarEpisodio(99, "Follow the Leader", 42, 8.9, lost);
        episodiosLost[99] = criarEpisodio(100, "The Incident: Part 1", 42, 9.2, lost);
        episodiosLost[100] = criarEpisodio(101, "The Incident: Part 2", 42, 9.4, lost);

        // Temporada 6 - 18 episódios
        episodiosLost[101] = criarEpisodio(102, "LA X: Part 1", 42, 8.8, lost);
        episodiosLost[102] = criarEpisodio(103, "LA X: Part 2", 42, 8.9, lost);
        episodiosLost[103] = criarEpisodio(104, "What Kate Does", 42, 8.4, lost);
        episodiosLost[104] = criarEpisodio(105, "The Substitute", 42, 8.7, lost);
        episodiosLost[105] = criarEpisodio(106, "Lighthouse", 42, 8.5, lost);
        episodiosLost[106] = criarEpisodio(107, "Sundown", 42, 8.6, lost);
        episodiosLost[107] = criarEpisodio(108, "Dr. Linus", 42, 8.8, lost);
        episodiosLost[108] = criarEpisodio(109, "Recon", 42, 8.4, lost);
        episodiosLost[109] = criarEpisodio(110, "Ab Aeterno", 42, 9.5, lost);
        episodiosLost[110] = criarEpisodio(111, "The Package", 42, 8.5, lost);
        episodiosLost[111] = criarEpisodio(112, "Happily Ever After", 42, 9.3, lost);
        episodiosLost[112] = criarEpisodio(113, "Everybody Loves Hugo", 42, 8.6, lost);
        episodiosLost[113] = criarEpisodio(114, "The Last Recruit", 42, 8.7, lost);
        episodiosLost[114] = criarEpisodio(115, "The Candidate", 42, 9.0, lost);
        episodiosLost[115] = criarEpisodio(116, "Across the Sea", 42, 9.1, lost);
        episodiosLost[116] = criarEpisodio(117, "What They Died For", 42, 8.8, lost);
        episodiosLost[117] = criarEpisodio(118, "The End: Part 1", 42, 9.2, lost);
        episodiosLost[118] = criarEpisodio(119, "The End: Part 2", 42, 9.4, lost);
        episodiosLost[119] = criarEpisodio(120, "The New Man in Charge", 42, 8.7, lost);

        Episodio[] todosEpisodios = new Episodio[200];
        int index = 0;

        for (Episodio ep : episodiosTheBoys) {
            todosEpisodios[index++] = ep;
        }

        for (Episodio ep : episodiosBreakingBad) {
            todosEpisodios[index++] = ep;
        }

        for (Episodio ep : episodiosLost) {
            todosEpisodios[index++] = ep;
        }

        return todosEpisodios;
    }

    private static Episodio criarEpisodio(int numero, String nome, int duracao, double nota, Serie serie) {
        Episodio ep = new Episodio();
        ep.setNumeroEpisodio(numero);
        ep.setNomeEpisodio(nome);
        ep.setDuracaoEpisodio(duracao);
        ep.setNotaEpisodio(nota);
        ep.setAssistido(false);
        ep.setSerie(serie);
        return ep;
    }
}
