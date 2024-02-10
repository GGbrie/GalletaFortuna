import java.util.Random;
public class MensajeEdades {
    private Random random;
    public MensajeEdades() {
        random = new Random();
    }
    public String mensajeEdad14() {
        String[] mensajes = {
                "Disfruta al máximo cada instante de tu juventud.",
                "Grandes aventuras están por llegar a tu vida.",
                "Confía en tus instintos y sigue tus sueños.",
                "La felicidad está en las pequeñas cosas de la vida."
        };
        return mensajes[random.nextInt(mensajes.length)];
    }
    public String mensajeEdad18() {
        String[] mensajes = {
                "Prepara tus alas para volar alto.",
                "Abraza el cambio y crece con cada experiencia.",
                "El mundo está lleno de oportunidades, ¡ve y atrápalas!",
                "La determinación te llevará lejos en esta nueva etapa de tu vida."
        };
        return mensajes[random.nextInt(mensajes.length)];
    }
    public String mensajeEdad25() {
        String[] mensajes = {
                "Confía en ti mismo y persigue tus metas con pasión.",
                "Cada desafío es una oportunidad para crecer y aprender",
                "El éxito llega a aquellos que perseveran y nunca se rinden",
                "Tu determinación y dedicación te llevarán a grandes logros."
        };
        return mensajes[random.nextInt(mensajes.length)];
    }
    public String mensajeAleatorio() {
        String[] mensajes = {
                "Hoy tienes la suerte de tu lado.",
                "Grandes cosas te aguardan en el futuro cercano.",
                "Confía en tu intuición; te guiará por el camino correcto",
                "Una nueva amistad traerá alegría a tu vida."
        };
        return mensajes[random.nextInt(mensajes.length)];
    }
}
