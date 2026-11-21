package org.mlm.adblock;

public final class BlockDecision {
    private final boolean matched;
    private final boolean important;
    private final String redirect;
    private final String rewrittenUrl;
    private final boolean exception;

    public BlockDecision(boolean matched, boolean important,
                         String redirect, String rewrittenUrl,
                         boolean exception) {
        this.matched = matched;
        this.important = important;
        this.redirect = redirect;
        this.rewrittenUrl = rewrittenUrl;
        this.exception = exception;
    }

    public boolean getMatched() { return matched; }
    public boolean getImportant() { return important; }
    public String getRedirect() { return redirect; }
    public String getRewrittenUrl() { return rewrittenUrl; }
    public boolean getException() { return exception; }
}
