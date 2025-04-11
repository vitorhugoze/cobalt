package it.auties.whatsapp.model.action;

public class MuteActionBuilder {
    private boolean muted;
    private java.util.OptionalLong muteEndTimestampSeconds;
    private boolean autoMuted;

    public MuteActionBuilder() {
        muted = false;
        muteEndTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.newOptionalLong();
        autoMuted = false;
    }

    public MuteActionBuilder muted(boolean muted) {
        this.muted = muted;
        return this;
    }

    public MuteActionBuilder muteEndTimestampSeconds(java.lang.Long muteEndTimestampSeconds) {
        this.muteEndTimestampSeconds = it.auties.protobuf.builtin.ProtobufOptionalMixin.ofOptional(muteEndTimestampSeconds);
        return this;
    }

    public MuteActionBuilder autoMuted(boolean autoMuted) {
        this.autoMuted = autoMuted;
        return this;
    }

    public it.auties.whatsapp.model.action.MuteAction build() {
        return new it.auties.whatsapp.model.action.MuteAction(muted, muteEndTimestampSeconds, autoMuted);
    }

}
