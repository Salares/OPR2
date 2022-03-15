package ukol2;

import java.util.ArrayList;

public class FilteringManager {
    public Player[] applyFilter(Player[] players, Filters filter, String arg) {
        ArrayList<Player> temp = new ArrayList<>();
        ArrayList<Player> retAL = new ArrayList<>();
        for (Player player : players) {
            temp.add(player);
        }
        String pattern;
        String trimmedArg;
        int filterArg;


        for (Player player : temp) {
            switch(filter) {
                case TALLER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getHeight() > filterArg) {
                        retAL.add(player);
                    }
                    break;
                case SHORTER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getHeight() < filterArg) {
                        retAL.add(player);
                    }
                    break;


                case GENDER:
                    pattern = "(\\d)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    trimmedArg = trimmedArg.toLowerCase();

                    switch(trimmedArg) {
                        case "male":
                        case "m":
                        case "man":
                            if(player.getGender() == Gender.MALE) {
                                retAL.add(player);
                            }
                            break;
                        case "female":
                        case "f":
                        case "woman":
                            if(player.getGender() == Gender.FEMALE) {
                                retAL.add(player);
                            }
                            break;
                        default:
                            throw new IllegalArgumentException("Illegal Filter Argument");
                    }
                    break;



                case POSITION:
                    pattern = "(\\d)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    trimmedArg = trimmedArg.toLowerCase();

                    switch(trimmedArg) {
                        case "attacker":
                        case "a":
                            if(player.getPosition() == PlayerPosition.ATTACKER) {
                                retAL.add(player);
                            }
                            break;
                        case "defender":
                        case "d":
                            if(player.getPosition() == PlayerPosition.DEFENDER) {
                                retAL.add(player);
                            }
                            break;
                        case "middle":
                        case "m":
                            if(player.getPosition() == PlayerPosition.MIDDLE) {
                                retAL.add(player);
                            }
                            break;
                        case "sweeper":
                        case "sw":
                            if(player.getPosition() == PlayerPosition.SWEEPER) {
                                retAL.add(player);
                            }
                            break;
                        case "support":
                        case "su":
                            if(player.getPosition() == PlayerPosition.SUPPORT) {
                                retAL.add(player);
                            }
                            break;

                        default:
                            throw new IllegalArgumentException("Illegal Filter Argument");
                    }
                    break;



                case HEAVIER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getWeight() > filterArg) {
                        retAL.add(player);
                    }
                    break;



                case LIGHTER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getWeight() < filterArg) {
                        retAL.add(player);
                    }
                    break;

                case SKILL_LEVEL_HIGHER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getSkillLevel() > filterArg) {
                        retAL.add(player);
                    }
                    break;

                case SKILL_LEVEL_LOWER_THAN:
                    pattern = "(\\D)(\\s)";
                    trimmedArg = arg.replaceAll(pattern, arg);
                    filterArg = Integer.parseInt(trimmedArg);

                    if(player.getSkillLevel() < filterArg) {
                        retAL.add(player);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Filter not implemented");

            }
        }

        Player[] ret = new Player[retAL.size()];
        int i = 0;
        for (Player player : retAL) {
            ret[i] = player;
            i++;
        }
        return ret;
    }
}
