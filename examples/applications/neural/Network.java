package applications.neural;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Network {
    public final int ins, outs;
    public int numberOfLayers;
    public final ArrayList<Integer> layers;
    public Network (int ins, int outs) {
        this.ins = ins; this.outs = outs;
        this.layers = new ArrayList<>();
        this.numberOfLayers = 0;
    }

    public void addLayer() {
        this.layers.add(1);
        this.numberOfLayers++;
    }

    public void addNode(int toLayer) {
        // assert toLayer < numberOfLayers;
        this.layers.set(toLayer, this.layers.get(toLayer) + 1);
    }

    @Override
    public String toString() {
        String s = "[";
        for (int layer = 0; layer < this.layers.size(); layer++) {
            s += this.layers.get(layer)*50 + ";";
        }
        return s + "]";
    }

    public String toPyCode() {
        String header = "import os\n" +
                "from ENN.ennpolicy import ENNPolicy\n" +
                "from ENN.useenn import use\n" +
                "from ENN.useenn import train\n" +
                "from timeit import default_timer as timer\n\n\n" +
                "start = timer()\n";
        String structure = "net = ENNPolicy(" + ins + ", [";
        for (int layer = 0; layer < this.numberOfLayers; layer++) {
            structure += this.layers.get(layer)*50;
            if (layer != this.numberOfLayers - 1) {
                structure += ", ";
            }
        }
        structure += "], " + outs + ")";
        String footer = "train(net)\n" +
                "end = timer()\n" +
                "fitness = use(net)\n" +
                "solved = \"solved\" if fitness > 400 else \"-\"\n" +
                "print(f\"{solved}," + structure + ",{end-start},{fitness}\")\n";
        return header + structure + "\n" + footer;
    }

    public static Network fromCreationSequence(String seq, int ins, int outs) {
        Network network = new Network(ins, outs);
        String regex ="(a|(b\\d+))+?";
        Matcher matcher = Pattern.compile(regex).matcher(seq);
        while (matcher.find()) {
            String operation = matcher.group(1);
            if (operation.equals("a")) {
                network.addLayer();
            } else if (operation.charAt(0) == 'b') {
                int layer = Integer.parseInt(operation.substring(1));
                network.addNode(layer);
            }
        }
        return network;
    }

}